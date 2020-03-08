package LCString;

public class RepeatedSubStringPattern459 {

    public boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        int len = s.length();
        for(int i=1; i <= len/2; i++) {
            if (len%i == 0) {
                if (checkPattern(s, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkPattern(String s, int n) {
        int m = s.length()/n;
        String base = s.substring(0, n);
        for(int i=1; i < m; i++) {
            if (!base.equals(s.substring(i*n, (i+1)*n))) return false;
        }
        return true;
    }
}
