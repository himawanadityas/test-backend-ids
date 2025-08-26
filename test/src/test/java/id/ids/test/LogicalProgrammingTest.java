package id.ids.test;

import org.junit.jupiter.api.Test;

public class LogicalProgrammingTest {

    @Test
    void test() {
        int temp = 0;
        int satu = 0;
        int iSatuChange = 0;
        int iDua = 0;
        int iDuaChange = 0;
        int iTiga = 0;
        int iTigaChange = 0;
        int iEmpat = 0;
        int iEmpatChange = 0;
        int iLima = 0;
        int iLimaChange = 0;
        for (int iSatu = 0; iSatu <= 10; iSatu++) {
            System.out.println("Loop (iSatu) " + iSatu);
            temp = 0;
            iSatuChange++;
            satu = iSatu;


            if (iSatu % 4 == 0) {
                temp = iDua + iTiga + iSatu - iLima;
                if (temp != iDua) {
                    iDuaChange++;
                    System.out.println("Nilai iDua saat berubah dari " + iDua + " menjadi " + temp);
                }
                iDua = temp;
            }


            if (iSatu % 3 == 0) {
                temp = iTiga + (iSatu + iDua) - iEmpat;
                if (temp != iTiga) {
                    iTigaChange++;
                    System.out.println("Nilai iTiga saat berubah dari " + iTiga + " menjadi " + temp);
                }
                iTiga = temp;
            }


            if (iSatu % 2 == 0) {
                temp = iEmpat + (iDua + iSatu) - iTiga;
                if (temp != iEmpat) {
                    iEmpatChange++;
                    System.out.println("Nilai iEmpat saat berubah dari " + iEmpat + " menjadi " + temp);
                }
                iEmpat = temp;
            }


            if (iSatu % 1 == 0) {
                temp = iDua + iTiga + iSatu;
                if (temp != iLima) {
                    iLimaChange++;
                    System.out.println("Nilai iLima saat berubah dari " + iLima + " menjadi " + temp);
                }
                iLima = temp;
            }


        }

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("Nilai akhir iSatu " + satu);
        System.out.println("Jumlah Perubahan pada iSatu " + iSatuChange);
        System.out.println("Nilai akhir iDua " + iDua);
        System.out.println("Jumlah Perubahan pada iDua " + iDuaChange);
        System.out.println("Nilai akhir iTiga " + iTiga);
        System.out.println("Jumlah Perubahan pada iTiga " + iTigaChange);
        System.out.println("Nilai akhir iEmpat " + iEmpat);
        System.out.println("Jumlah Perubahan pada iEmpat " + iEmpatChange);
        System.out.println("Nilai akhir iLima " + iLima);
        System.out.println("Jumlah Perubahan pada iLima " + iLimaChange);


    }
}
