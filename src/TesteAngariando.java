import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TesteAngariando {

    public static class Trinca implements Comparable {
        public long a = 0;
        public long b = 0;
        public long c = 0;

        long getA() { return a; }
        long getB() { return b; }
        long getC() { return c; }

        Trinca(long  _a, long _b, long _c) {
            a = _a;
            b = _b;
            c = _c;
        }

        @Override
        public int compareTo(Object other) {

            return Comparator.comparing(Trinca::getA)
                    .thenComparing(Trinca::getB)
                    .thenComparingLong(Trinca::getC)
                    .compare(this, (Trinca)other);
        }

    }

    static ArrayList<Trinca> sweep = new ArrayList<Trinca>();
    static ArrayList<Trinca> atu = new ArrayList<Trinca>();
    static ArrayList<Long> comp = new ArrayList<Long>();

    static final int MAXN = 10 ^ 5;
    static long[] BIT = new long[MAXN];
    static long resp = 0;
    static long N = 0;
    static long[] e1 = new long[MAXN];
    static long[] e2 = new long[MAXN];
    static long[] e3 = new long[MAXN];

    static long max(long a, long b) {
        return a < b ? b : a;
    }

    static void update(int idx, long delta) {
        while (idx < MAXN) {
            BIT[idx] = max(BIT[idx], delta);
            idx += (idx & -idx);
        }
    }

    static long query(int idx) {
        long ans = 0;
        while (idx > 0) {
            ans = max(BIT[idx], ans);
            idx -= (idx & -idx);
        }
        return ans;
    }

    public static long lower_bound(ArrayList<Long> ar, long k) {
        long s = 0;
        long e = ar.size();
        while (s != e) {
            long mid = s + e >> 1;
            if (ar.get((int)mid) < k) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        if (s == ar.size()) {
            return -1;
        }
        return s;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);

        N = sc.nextLong();

        for (int i = 0; i < N; i++) {
            e1[i] = sc.nextLong();
            e2[i] = sc.nextLong();
            e3[i] = sc.nextLong();

            comp.add(e2[i]);
        }

        comp.sort(null);

        for (int i = 0; i < N; i++) {
            e2[i] = lower_bound(comp, e2[i]) + 1;

            sweep.add(new Trinca(e1[i], e2[i], e3[i]));
        }

        sweep.sort(null);

        ArrayList<Trinca> agoravai = new ArrayList<Trinca>();
        for (int i = 0; i < N; i++) {

            if (agoravai.size() != 0 && (agoravai.get(agoravai.size() - 1).a == sweep.get(i).a)
                    && (agoravai.get(agoravai.size() - 1).b == sweep.get(i).b)) {
                agoravai.get(agoravai.size() - 1).c += sweep.get(i).c;

            } else {
                agoravai.add(new Trinca(sweep.get(i).a, sweep.get(i).b, sweep.get(i).c));
            }
        }

        for(int i = 0; i < agoravai.size(); i++) {
            sweep.get(i).a = agoravai.get(i).a;
            sweep.get(i).b = agoravai.get(i).b;
            sweep.get(i).c = agoravai.get(i).c;
        }

        for (int i = 0; i < N; i++) {

            long x, y, val;

            x = sweep.get(i).a;
            y = sweep.get(i).b;
            val = sweep.get(i).c;

            while (atu.size() != 0 && atu.get(atu.size() - 1).a < x) {
                update((int)atu.get(atu.size() - 1).b, atu.get(atu.size() - 1).c);
                atu.remove(atu.size() - 1);
            }
            long davez = query((int)y - 1) + val;
            atu.add(new Trinca(x, y, davez));
            resp = max(resp, davez);
        }

        System.out.println(resp);
    }
}