How to create and run jar acrhive
javac -d out -cp "src;lib/Pokemon.jar" src/org/itmo/lab2/battle/Battlefield.java (from lab2 directory)
jar -cfm <name>,jar MANIFEST.MF lib org (We, lib and MANIFEST.MF must be in /out)
java -jar <name>.jar