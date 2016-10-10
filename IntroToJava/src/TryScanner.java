/**
 * Author: Vien Van
 * Description: Testing out the scanner input methods
 * Name: Exercise 3.2
 * Date: 10/09/2016
 */

import java.util.Scanner;

public class TryScanner{
    static Scanner scanner = new Scanner(System.in);

    // static method to find average of three numbers
    public static int findAverage(int num1, int num2, int num3)
    {
        int sum = num1 + num2 + num3;
        int average = Math.round(sum/3);
        return average;
    }

    // static method to find largest of three numbers
    public static int findLargest(int num1, int num2, int num3) {
        int largest;
        if(num1 == num2) {
            num1 = num2;
        }
        else if(num2 == num3) {
            num2 = num3;
        }
        else if (num1 == num3) {
            num1 = num3;
        }
        else if ((num1 == num2) && (num1 == num3)) {
            largest = num1;
        }
        largest = (num1 > num2) ? num1 : num2;
        largest = (largest > num3) ? largest : num3;
        return largest;


    }
    public static void main( String [] args )
    {
        int num1, num2, num3;
        System.out.println("Enter a positive integer: ");
        num1 = scanner.nextInt();
        System.out.println("Enter another positive integer: ");
        num2 = scanner.nextInt();
        System.out.println("Enter one more positive integer: ");
        num3 = scanner.nextInt();
        System.out.println("Largest number: " + findLargest(num1, num2, num3));
        System.out.println("Average of three number: " + findAverage(num1, num2, num3));

    }
}

///Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/bin/java -Didea.launcher.port=7539 "-Didea.launcher.bin.path=/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/lib/tools.jar:/Users/VienVonVan/IdeaProjects/IntroToJava/out/production/IntroToJava:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar" com.intellij.rt.execution.application.AppMain TryScanner
//        Enter a positive integer:
//        120
//        Enter another positive integer:
//        130
//        Enter one more positive integer:
//        140
//        Largest number: 140
//        Average of three number: 130
//
//        Process finished with exit code 0