/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Git;

import java.lang.System;

/**
 *
 * @author gzy
 */
public class GitOP {
    public boolean gitInit(){
        String homeDirectory = System.getProperty("user.dir");
        Process process;
        if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
            try {
                process = Runtime.getRuntime().exec(String.format("cmd.exe /c cd %s && git init .", homeDirectory));
            } catch (Exception e) {
                return false;
            }
        } else {
            try{
                process = Runtime.getRuntime().exec(String.format("cd %s && git init .", homeDirectory));
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
    
    public boolean gitAdd(){
        String homeDirectory = System.getProperty("user.dir");
        Process process;
        if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
            try {
                process = Runtime.getRuntime().exec(String.format("cmd.exe /c cd %s && git add .", homeDirectory));
            } catch (Exception e) {
                return false;
            }
        } else {
            try{
                process = Runtime.getRuntime().exec(String.format("cd %s && git add .", homeDirectory));
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
    
    public boolean gitCommit(){
        String homeDirectory = System.getProperty("user.dir");
        Process process;
        if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
            try {
                process = Runtime.getRuntime().exec(String.format("cmd.exe /c cd %s && git commit -m \"update\"", homeDirectory));
            } catch (Exception e) {
                return false;
            }
        } else {
            try{
                process = Runtime.getRuntime().exec(String.format("cd %s && git commit -m \"update\"", homeDirectory));
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
    
    public boolean gitPush(){
        String homeDirectory = System.getProperty("user.dir");
        Process process;
        if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
            try {
                process = Runtime.getRuntime().exec(String.format("cmd.exe /c cd %s && git push origin master", homeDirectory));
            } catch (Exception e) {
                try {
                process = Runtime.getRuntime().exec(String.format("cmd.exe /c cd %s && git push origin main", homeDirectory));
                } catch (Exception f) {
                    return false;
                }
            }
        } else {
            try{
                process = Runtime.getRuntime().exec(String.format("cd %s && git push origin main", homeDirectory));
            } catch (Exception e) {
                try{
                    process = Runtime.getRuntime().exec(String.format("cd %s && git push origin main", homeDirectory));
                } catch (Exception f) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean gitPull(){
        String homeDirectory = System.getProperty("user.dir");
        Process process;
        if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
            try {
                process = Runtime.getRuntime().exec(String.format("cmd.exe /c cd %s && git pull origin master", homeDirectory));
            } catch (Exception e) {
                try {
                process = Runtime.getRuntime().exec(String.format("cmd.exe /c cd %s && git pull origin main", homeDirectory));
                } catch (Exception f) {
                    return false;
                }
            }
        } else {
            try{
                process = Runtime.getRuntime().exec(String.format("cd %s && git pull origin main", homeDirectory));
            } catch (Exception e) {
                try{
                    process = Runtime.getRuntime().exec(String.format("cd %s && git pull origin main", homeDirectory));
                } catch (Exception f) {
                    return false;
                }
            }
        }
        return true;
    }
}
