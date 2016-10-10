/**
 * Author: Vien Van
 * Description: Practice Output Format
 * Name: Exercise 2.4
 * Date: 10/05/2016
 */
public class Exercise_2_4 {
    public static void main(String[] args)
    {
        // Print and format header
        System.out.printf("%10s", "Integer");
        System.out.printf("%3c", ' ');
        System.out.printf("%10s", "Square");
        System.out.printf("%3c", ' ');
        System.out.printf("%10s", "Cube\n");
        System.out.print("\n");
        for(int i = 2; i <= 20; i++) {
            // Manipulate data and print to console
            System.out.printf("%10d", i);
            System.out.printf("%3c", ' ');
            System.out.printf("%10d", i * i);
            System.out.printf("%3c", ' ');
            System.out.printf("%9d", i * i * i);
            System.out.print('\n');

        }
    }
}

///Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/bin/java -Didea.launcher.port=7533 "-Didea.launcher.bin.path=/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/lib/tools.jar:/Users/VienVonVan/IdeaProjects/IntroToJava/out/production/IntroToJava:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar" com.intellij.rt.execution.application.AppMain Exercise_2_4
//  Integer       Square        Cube
//
//        2            4           8
//        3            9          27
//        4           16          64
//        5           25         125
//        6           36         216
//        7           49         343
//        8           64         512
//        9           81         729
//       10          100        1000
//       11          121        1331
//       12          144        1728
//       13          169        2197
//       14          196        2744
//       15          225        3375
//       16          256        4096
//       17          289        4913
//       18          324        5832
//       19          361        6859
//       20          400        8000
//
//Process finished with exit code 0