# Proxy Pattern 对象结构型模式

## 根本动机

当我们确实合理地需要某个对象的时候才进行创建、初始化和使用

## External Examples

### Caching(CA)

所谓内存是硬盘的cache，Cache是内存的cache，虚存/页表是物理内存的Cache，TLB是页表的Cache，核心：间接操作。

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

### 装饰器

iterator模式

## Application

### Scenes

#### Copy on Write

#### Synchronization

#### Smart Reference

#### Referred ones

远程代理，保护代理，Cache代理，FireWall代理

### Internal Example

Spring AOP