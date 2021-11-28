# Proxy Pattern 对象结构型模式

## 根本动机

当我们确实合理地需要某个对象的时候才进行创建、初始化和使用

## External Examples

### Caching(CA)

所谓内存是硬盘的cache，Cache是内存的cache，虚存/页表是物理内存的Cache，TLB是页表的Cache，核心：间接操作，用户透明。

当`malloc(length)`操作时，一开始OS并不实际分配物理空间，只是将（无效的）页表项填入TLB（TLB重填异常），而后若用户不访问，则不会浪费空间，所谓用户并不真正需要。

若真正需要使用了再由操作页无效异常等将物理页面分配/有效页表项的建立

UML

### Wall and Cross Wall(Network)

- FireWall：数据包过滤器，先经过FireWall后到主机
- GreatChinaWall：访问被禁止的IP会被阻拦，先访问代理，查询地址是否合法，后继续TCP请求，否则代理向目标发送Reset connection
- Proxy：SSR, v2ray，访问允许的IP，中间服务器绕过GreatChinaWall，继续请求
- VPN：公司一部分服务器允许特定员工使用，不允许外人使用，检查请求端IP。客户端与服务端使用隧道协议加密、匿名，保证隐私和安全

### Else

- Windows快捷方式：保存指向应用程序的指针(cache)
- 楚留香易容术
- 支票/信用卡是对现金的代理

## Implementation

简单来讲，`Proxy`和`Real`两个类实现同一个接口，用户只能访问`Proxy`，而`Proxy`使用组合关系包含`Real`，对于接口的实现方式也是通过调用`Real`类对象的真正操作方法。

此外根据需要，在`Proxy`中可以加入任意的辅助操作，例如检查访问方式是否安全，返回数据是否合法等

## Comparison

### 适配器

同样是适配器和实体类同时实现某一接口，但是这二者角色相反，使用时调用的是实体类而不是适配器，实体类包含适配器类，调用需求进行操作时使用适配器调用适配其他专门需求的接口实体。

实体可以解决某些需求但是当有超出规范的请求时调用适配器转换或者转接到其他的实现实体中。

![adaptor](https://www.runoob.com/wp-content/uploads/2014/08/20210223-adapter.png)

### 装饰器

通过装饰来丰富原有对象的功能，想要实现的都不再是原有对象的功能

适配器是同类的需求，装饰器是不同类型的功能

![decorator](https://www.runoob.com/design-pattern/decorator-pattern.html)

### iterator模式

是代理模式在数组迭代器中的应用，通过迭代器的方式遍历聚合元素而无需知晓底层实现，caching

## Application

### Scenes

#### Copy on Write

（等到）写入时（再）复制，如果资源被复制但未被修改，则无需复制成为新的资源。将复制操作推迟到第一次写入。拷贝操作针对庞大复杂的对象而言是开销很大的操作，

对实体进行引用计数，拷贝操作会增加引用计数，只有当用户请求修改实体的操作时，代理才会将其拷贝，将引用计数减小，为0时删除之。

##### Application

- 操作系统
`fork()`操作并不会修改物理内存，而是立即执行新进程，当出现对内存的修改时将分配新的物理页、建立页表

#### Synchronization

manages all synchronization between a backend database and offline mobile apps.

老师上课的图

#### Referred ones

虚拟代理，远程代理，保护代理，Cache代理，FireWall代理
虚拟代理：在用户真正使用/更改对象之前，只想用户展示对象的轻量级副本，例：Preview in mac Finder，PPT/图片从内存加载

### Internal Example

Spring AOP，面向方面编程

- 核心业务：登陆、修改数据
- 周边功能：性能统计、日志——方面

核心业务和切面功能分别独立开发，然后编织在一起

将与业务无关，却为业务模块共同调用的逻辑封装起来，水平提取机制减少系统重复代码，降低模块之间的耦合度，有利于可拓展性和可维护性

和代理的关系？

使用代理模式，提取一些周边功能代码，与核心业务分离，不会侵入原始代码，而是进行用额外的层进行整合，增强类的功能

- 静态代理：代理类在运行之前存在，代码与代理对象匹配
- 动态代理：代理工作在运行时动态完成：JDK/CGLIB，制作动态处理器，一个动态处理器可以处理很多类，JDK：目标类必须实现接口，CGLIB：通过字节码技术为类创建，在子类中使用方法拦截技术拦截父类中的所有调用，编织横切逻辑

KeyWords:

- 方面：跨越多个类的关注点的模块化。事务管理是 J2EE 应用程序中跨领域问题的一个很好的例子。在Spring AOP中，各个方面是使用常规类（基于架构的方法）或用@Aspect注释（@AspectJ样式）注释的常规类来实现的
- 连接点：程序执行过程中的点，例如方法的执行或异常的处理。在 Spring AOP 中，连接点始终表示方法执行。
- 建议：由某个方面在特定连接点上执行的操作。不同类型的建议包括"周围"，"之前"和"之后"建议。（建议类型将在下面讨论。许多AOP框架，包括Spring，将建议建模为拦截器，在连接点周围维护一系列拦截器。
- 切入点：与连接点匹配的谓词。建议与切入点表达式相关联，并在与切点匹配的任何连接点（例如，执行具有特定名称的方法）处运行。与切点表达式匹配的连接点的概念是 AOP 的核心，Spring 默认使用 AspectJ 切入点表达式语言。
- 简介：代表类型声明其他方法或字段。Spring AOP允许您为任何建议对象引入新的接口（和相应的实现）。例如，您可以使用简介使 Bean 实现IsModified接口，以简化缓存。（简介在AspectJ社区中被称为类型间声明。
- 目标对象：由一个或多个方面建议的对象。也称为建议对象。由于Spring AOP是使用运行时代理实现的，因此此对象将始终是代理对象。
- AOP代理：由AOP框架创建的对象，用于实现方面协定（建议方法执行等）。在Spring框架中，AOP代理将是JDK动态代理或CGLIB代理。
- 编织：将各个方面与其他应用程序类型或对象链接以创建建议对象。这可以在编译时（例如，使用AspectJ编译器）、加载时或运行时完成。Spring AOP与其他纯Java AOP框架一样，在运行时执行编织。

普通代码，直接在对象引用上调用该方法：

```java
public class SimplePojo implements Pojo {

   public void foo() {
      // this next method invocation is a direct call on the 'this' reference
      this.bar();
   }
   
   public void bar() {
      // some logic...
   }
}

public class Main {

   public static void main(String[] args) {
   
      Pojo pojo = new SimplePojo();
      
      // this is a direct method call on the 'pojo' reference
      pojo.foo();
   }
}

```

使用代理：

```java
public class Main {

   public static void main(String[] args) {
   
      ProxyFactory factory = new ProxyFactory(new SimplePojo());
      factory.addInterface(Pojo.class);
      factory.addAdvice(new RetryAdvice());

      Pojo pojo = (Pojo) factory.getProxy();
      
      // this is a method call on the proxy!
      pojo.foo();
   }
}
```

但是，一旦调用最终到达目标对象，在这种情况下，`SimplePojo`引用，它可能对自己进行的任何方法调用，如`this.bar()`或`this.foo()`，都将针对此引用而不是代理进行调用。

