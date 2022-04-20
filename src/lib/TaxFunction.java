package lib;

public class TaxFunction {

	
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */

public static class TaxCalculator {
    static void calculate() {

        final double RATE1 = 0.10;
        final double RATE2 = 0.15;
        final double RATE3 = 0.30;
        final double RATE1_SINGLE_LIMIT = 0;
        final double RATE2_COHABITATING_LIMIT = 20000;
        final double RATE3_COHABITATING_LIMIT = 50000;
        double tax = 0;
        Scanner in = new Scanner(System.in);
        //Enter Income
        System.out.print("Silakan masukkan penghasilan Anda: ");
        double income = in.nextDouble();
        in.nextLine();

        System.out.print("Masukkan 'S' untuk lajang, 'M' untuk menikah, atau 'C' untuk hidup bersama: ");
        String maritalStatus = in.next();
        in.nextLine();

        //Calculate Taxes

        if (maritalStatus.equals("S") && income > RATE1_SINGLE_LIMIT) {
        } else if (maritalStatus.equals("C") && income <= RATE2_COHABITATING_LIMIT) {
            tax = RATE1 * income;
        } else if (maritalStatus.equals("C") && income <= RATE3_COHABITATING_LIMIT) {
            tax = RATE2 * income;
        } else {
            tax = RATE3 * income;
        }

        System.out.print("Pajak Anda adalah: " + tax);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String newResponse = "";
        do {
            calculate();
            System.out.println();
            System.out.println("Ada tanggapan lain?. Silakan masukkan 'Y' untuk ya, atau 'N' untuk tidak: ");
            newResponse = in.next();
            in.nextLine();
        } while (newResponse.equals("Y"));

    }
}

	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int monthWorkingInYear,
			int annualDeductible, boolean equals, int size) {
		return 0;
	}
}