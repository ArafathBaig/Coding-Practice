package CodeChefJulyChallenge.MissingAPoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws IOException {

        InputReader br = new InputReader(System.in);

//        StringTokenizer st = new StringTokenizer(br.readLine());


        int t= br.readInt();

        while(t-- != 0){
            int n =br.readInt();

            Map<Integer, List<Integer>> x = new HashMap<>();
            Map<Integer, List<Integer>> y = new HashMap<>();

            for(int i = 0; i < 4*n-1;i++){
                int xa = br.readInt();
                int ya= br.readInt();

                if(!x.containsKey(xa))
                    x.put(xa,new ArrayList<>());

                if(!y.containsKey(ya))
                    y.put(ya, new ArrayList<>());

                x.get(xa).add(ya);
                y.get(ya).add(xa);
            }
            int ansX =0, ansY = 0;
            for(int k : x.keySet() ){
                if(x.get(k).size() % 2 == 1){
                    ansX = k;
                    break;
                }
            }

            for(int k : y.keySet()){
                if(y.get(k).size() % 2 == 1){
                    ansY = k;
                    break;
                }
            }

            System.out.println(ansX+" "+ansY);
        }
    }

    public static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];

        private int curChar;

        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new RuntimeException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String readString() {
            final StringBuilder stringBuilder = new StringBuilder();
            int c = read();
            while (isSpaceChar(c))
                c = read();
            do {
                stringBuilder.append(c);
                c = read();
            } while (!isSpaceChar(c));
            return stringBuilder.toString();
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long readLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}
