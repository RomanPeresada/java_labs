package module3.lab7.lab1;

@FunctionalInterface
public interface MyConverter {
    String comvertStr(String str);
    static boolean isNull(String str){
        return str!=null;
    }
}
