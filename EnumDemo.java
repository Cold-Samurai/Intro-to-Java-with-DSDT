import java.util.EnumSet;

class EnumDemo {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

       
        EnumSet<Size> sizes1 = EnumSet.of(Size.MEDIUM);
        System.out.println("EnumSet1: " + sizes1);

        EnumSet<Size> sizes2 = EnumSet.of(Size.SMALL, Size.LARGE);
        System.out.println("EnumSet2: " + sizes2);
    
        EnumSet<Size> sizes3 = EnumSet.of(Size.EXTRALARGE);
        System.out.println("EnumSet3: " + sizes3);
            
    }
}