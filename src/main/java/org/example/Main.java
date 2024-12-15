package org.example;



    interface ReplaceSymbolA {
        void replaceSymbolA(String str);
    }

    interface ReplaceSymbolB {
        void replaceSymbolB(String str);
    }

    class StringReplacer implements ReplaceSymbolA, ReplaceSymbolB {

        @Override
        public void replaceSymbolA(String str) {
            String result = str.replace('t', 'z');
            System.out.println(result);
        }

        @Override
        public void replaceSymbolB(String str) {
            String result = str.replace('m', 'w');
            System.out.println(result);
        }
    }

    public class Main {
        public static void main(String[] args) {
            StringReplacer replacer = new StringReplacer();

            String input1 = "konstantine";
            replacer.replaceSymbolA(input1); // დაბეჭდავს: konszanzine

            String input2 = "meladze";
            replacer.replaceSymbolB(input2); // დაბეჭდავს: weladze
        }
    }




