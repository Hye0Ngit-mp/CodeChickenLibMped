package codechicken.lib.vchecker;

public class VcheckerCCL {
	public static String displayVersion(boolean includeMcVersion) {
		if (includeMcVersion) {
			return "1.1.3-1.7.2";
		} else {
			return "1.1.3";
		}
	}
}
