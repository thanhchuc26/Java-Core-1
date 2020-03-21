/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session5_LoopingConstruct;

/**
 *
 * @author June
 */
public class foreach_enhancedfor {

    enum seasons {
        xuan, ha, thu, dong
    }

    public static void hienthimang_dungvonglap_for(int[] a) {
        System.out.println("Hien thi mang dung vong lap for:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void hienthimang_dungvonglap_foreach(int[] a) {
        System.out.println("Hien thi mang dung vong lap for each:");
        for (int i : a) {
            System.out.println(i + " ");
        }
    }

    public static void hienthi_enum_dungvonglap_foreach() {
        System.out.println("Hien thi enum dung vong lap for");
        for (seasons season : seasons.values()) {
            System.out.println(season);
        }
    }

    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 4};
        hienthimang_dungvonglap_for(mang);
        System.out.println("");
        hienthimang_dungvonglap_foreach(mang);
        System.out.println("");
        hienthi_enum_dungvonglap_foreach();
    }
}
