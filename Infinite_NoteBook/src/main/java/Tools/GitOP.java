/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import java.lang.System;

/**
 *
 * @author gzy
 */
public class GitOP {
    public boolean gitInit(){
        String projectDirectory = System.getProperty("user.dir");
        Process process;
        if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
            try {
                process = Runtime.getRuntime().exec(String.format("cmd.exe /c cd %s && git init .", projectDirectory));
            } catch (Exception e) {
                return false;
            }
        } else {
            try{
                process = Runtime.getRuntime().exec(String.format("cd %s && git init .", projectDirectory));
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
    
    public boolean gitAdd(){
        String projectDirectory = System.getProperty("user.dir");
        Process process;
        if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
            try {
                process = Runtime.getRuntime().exec(String.format("cmd.exe /c cd %s && git add .", projectDirectory));
            } catch (Exception e) {
                return false;
            }
        } else {
            try{
                process = Runtime.getRuntime().exec(String.format("cd %s && git add .", projectDirectory));
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
    
    public boolean gitCommit(){
        String projectDirectory = System.getProperty("user.dir");
        Process process;
        if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
            try {
                process = Runtime.getRuntime().exec(String.format("cmd.exe /c cd %s && git commit -m \"update\"", projectDirectory));
            } catch (Exception e) {
                return false;
            }
        } else {
            try{
                process = Runtime.getRuntime().exec(String.format("cd %s && git commit -m \"update\"", projectDirectory));
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
    
    public boolean gitPush(){
        String projectDirectory = System.getProperty("user.dir");
        Process process;
        if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
            try {
                process = Runtime.getRuntime().exec(String.format("cmd.exe /c cd %s && git push origin master", projectDirectory));
            } catch (Exception e) {
                try {
                process = Runtime.getRuntime().exec(String.format("cmd.exe /c cd %s && git push origin main", projectDirectory));
                } catch (Exception f) {
                    return false;
                }
            }
        } else {
            try{
                process = Runtime.getRuntime().exec(String.format("cd %s && git push origin main", projectDirectory));
            } catch (Exception e) {
                try{
                    process = Runtime.getRuntime().exec(String.format("cd %s && git push origin main", projectDirectory));
                } catch (Exception f) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean gitPull(){
        String projectDirectory = System.getProperty("user.dir");
        Process process;
        if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
            try {
                process = Runtime.getRuntime().exec(String.format("cmd.exe /c cd %s && git pull origin master", projectDirectory));
            } catch (Exception e) {
                try {
                process = Runtime.getRuntime().exec(String.format("cmd.exe /c cd %s && git pull origin main", projectDirectory));
                } catch (Exception f) {
                    return false;
                }
            }
        } else {
            try{
                process = Runtime.getRuntime().exec(String.format("cd %s && git pull origin main", projectDirectory));
            } catch (Exception e) {
                try{
                    process = Runtime.getRuntime().exec(String.format("cd %s && git pull origin main", projectDirectory));
                } catch (Exception f) {
                    return false;
                }
            }
        }
        return true;
    }
    
    
}
