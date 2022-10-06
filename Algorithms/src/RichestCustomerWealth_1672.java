public class RichestCustomerWealth_1672 {
	public static int maximumWealth2(int[][] a) {
		int soHang = a.length; // 2
		int soCot = a[0].length; // 3
		int[] tonngTaiSan = new int[soHang];
		for (int i = 0; i < soHang; i++) {
			int tinhTongHangI = 0;
			for (int j = 0; j < soCot; j++) {
				tinhTongHangI += a[i][j];
			}
			tonngTaiSan[i] = tinhTongHangI;
		}
		int max = 0;
		for (int i = 0; i < soHang; i++) {
			System.out.println("TongTaiSan KH " + i + ":" + tonngTaiSan[i]);
			if (tonngTaiSan[i] > max) {
				max = tonngTaiSan[i];
			}
		}
		System.out.println("TongTaiSan Max " + max);
		return max;
	}

	public static int maximumWealth(int[][] a) {
		int soCot = a[0].length; // 3
		int max = 0;
		for (int[] ints : a) {
			int tinhTongHangI = 0;
			for (int j = 0; j < soCot; j++) {
				tinhTongHangI += ints[j];
			}
			if (tinhTongHangI > max) {
				max = tinhTongHangI;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[][] a = {{1, 2, 3}, {3, 2, 1}};
		maximumWealth(a);
	}
}
