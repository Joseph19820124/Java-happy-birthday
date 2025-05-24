/**
 * Java 30周年纪念程序
 * 
 * 这个程序展示了Java从1995年到2025年的重要里程碑
 * 以及Java语言的核心特性和发展历程
 * 
 * @author Java Community
 * @since 1995-05-23
 * @version 30th Anniversary Edition
 */
public class Java30thAnniversary {
    
    // Java的重要版本发布年份
    private static final int[] MAJOR_VERSIONS = {
        1995, // Java 1.0 - 原始版本
        1997, // Java 1.1 - 事件模型改进
        1998, // Java 1.2 - Swing、Collections
        2000, // Java 1.3 - HotSpot JVM
        2002, // Java 1.4 - 正则表达式、NIO
        2004, // Java 5 - 泛型、注解、枚举
        2006, // Java 6 - 性能改进
        2011, // Java 7 - try-with-resources
        2014, // Java 8 - Lambda表达式
        2017, // Java 9 - 模块系统
        2018, // Java 10 - var关键字
        2018, // Java 11 - LTS版本
        2019, // Java 12 - Switch表达式
        2019, // Java 13 - Text Blocks预览
        2020, // Java 14 - Records预览
        2020, // Java 15 - Text Blocks正式
        2021, // Java 16 - Records正式
        2021, // Java 17 - LTS版本
        2022, // Java 18 - UTF-8默认
        2022, // Java 19 - Virtual Threads预览
        2023, // Java 20 - 作用域值
        2023, // Java 21 - LTS版本，Virtual Threads正式
        2024, // Java 22 - 外部函数接口预览
        2024, // Java 23 - 原始字符串模板
        2025  // Java 24 - 当前最新版本
    };
    
    public static void main(String[] args) {
        // 30年来不变的经典
        printBirthayWishes();
        
        // 展示Java的演进历程
        showJavaEvolution();
        
        // 展示Java的核心特性
        demonstrateJavaFeatures();
        
        // 展示现代Java特性
        showModernJavaFeatures();
    }
    
    /**
     * 打印生日祝福
     */
    private static void printBirthayWishes() {
        System.out.println("🎂 ================================");
        System.out.println("🎉  Happy 30th Birthday, Java!  🎉");
        System.out.println("🎂 ================================");
        System.out.println();
        System.out.println("✨ 1995年5月23日 - 2025年5月23日");
        System.out.println("✨ 三十载风雨历程，依然是那个少年！");
        System.out.println();
    }
    
    /**
     * 展示Java的演进历程
     */
    private static void showJavaEvolution() {
        System.out.println("📈 Java版本演进历程:");
        System.out.println("==================");
        
        for (int i = 0; i < MAJOR_VERSIONS.length; i++) {
            String version = i < 5 ? "1." + i : String.valueOf(i);
            System.out.printf("Java %-2s (%d年) - %s%n", 
                version, 
                MAJOR_VERSIONS[i], 
                getVersionHighlight(i));
        }
        System.out.println();
    }
    
    /**
     * 获取版本亮点
     */
    private static String getVersionHighlight(int versionIndex) {
        String[] highlights = {
            "Java诞生，改变世界",
            "事件模型重构",
            "Swing GUI + Collections",
            "HotSpot JVM性能飞跃",
            "正则表达式 + NIO",
            "泛型革命 + 注解系统",
            "性能优化集大成",
            "Try-with-resources",
            "Lambda表达式 + Stream API",
            "模块系统(Jigsaw)",
            "局部变量类型推断(var)",
            "长期支持版本(LTS)",
            "Switch表达式增强",
            "Text Blocks预览",
            "Records类型预览",
            "Text Blocks正式版",
            "Records正式版",
            "新LTS版本 + Pattern Matching",
            "UTF-8默认编码",
            "Virtual Threads预览",
            "Scoped Values",
            "Virtual Threads正式版",
            "Foreign Function Interface",
            "String Templates",
            "最新版本特性"
        };
        
        return versionIndex < highlights.length ? 
            highlights[versionIndex] : "持续创新";
    }
    
    /**
     * 展示Java的核心特性
     */
    private static void demonstrateJavaFeatures() {
        System.out.println("🚀 Java核心特性展示:");
        System.out.println("===================");
        
        // 1. 面向对象编程
        System.out.println("1. 面向对象编程 (OOP):");
        Car car = new Car("Tesla", "Model 3");
        car.start();
        
        // 2. 平台无关性
        System.out.println("\n2. 平台无关性:");
        System.out.println("   Write Once, Run Anywhere!");
        System.out.println("   当前运行环境: " + System.getProperty("os.name"));
        
        // 3. 自动内存管理
        System.out.println("\n3. 自动内存管理:");
        System.out.println("   无需手动管理内存，GC自动回收");
        
        // 4. 强类型系统
        System.out.println("\n4. 强类型系统:");
        String message = "Java is 30 years old!";
        int age = 30;
        System.out.println("   " + message + " Age: " + age);
        
        System.out.println();
    }
    
    /**
     * 展示现代Java特性
     */
    private static void showModernJavaFeatures() {
        System.out.println("🔥 现代Java特性 (Java 8-21):");
        System.out.println("============================");
        
        // Lambda表达式 (Java 8)
        System.out.println("1. Lambda表达式 (Java 8):");
        java.util.List<String> languages = java.util.Arrays.asList(
            "Java", "C++", "Python", "JavaScript", "C#"
        );
        languages.stream()
            .filter(lang -> lang.startsWith("J"))
            .forEach(lang -> System.out.println("   - " + lang));
        
        // Stream API (Java 8)
        System.out.println("\n2. Stream API (Java 8):");
        long javaRelatedCount = languages.stream()
            .filter(lang -> lang.contains("Java"))
            .count();
        System.out.println("   包含'Java'的语言数量: " + javaRelatedCount);
        
        // var关键字 (Java 10)
        System.out.println("\n3. 局部变量类型推断 (Java 10):");
        var currentYear = 2025;
        var birthYear = 1995;
        System.out.println("   Java年龄: " + (currentYear - birthYear) + "岁");
        
        // Text Blocks (Java 15)
        System.out.println("\n4. Text Blocks (Java 15):");
        var poem = """
            三十年前Oak初现，
            如今Java遍天下。
            企业应用稳如山，
            云原生时代再出发。
            """;
        System.out.println(poem);
        
        System.out.println("🎊 Java，生日快乐！愿你在下一个30年继续闪耀！");
    }
}

/**
 * 简单的汽车类，展示Java的面向对象特性
 */
class Car {
    private String brand;
    private String model;
    
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
    public void start() {
        System.out.println("   " + brand + " " + model + " 启动了！");
    }
    
    // Getter methods
    public String getBrand() { return brand; }
    public String getModel() { return model; }
}