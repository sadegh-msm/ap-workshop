package third;

import second.lab;

public class third {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        uni u = new uni("ce");
        uni u2 = new uni("se");

        lab l1 = new lab(10, "1400-7-10");
        lab l2 = new lab(15, "1400-7-15");
        lab l3 = new lab(20, "1400-7-20");

        lab[] labs = new lab[] {l1, l2, l3};
        u.setLabs(labs);
        u.setSessionInfo("computer engineering");
        System.out.println(u.getName());
        System.out.println(u.getSessionInfo());
    }
}
