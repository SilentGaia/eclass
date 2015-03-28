javac -cp .:junit4-4.8.2.jar \
    eclasstool/model/*/*.java eclasstool/tests/*/*.java
#    eclasstool/model/*/*.java eclasstool/tests/chat/*.java eclasstool/tests/roster/*.java
javac -cp .:junit4-4.8.2.jar \
    JUnitTestSuite.java
java -cp .:junit4-4.8.2.jar:hamcrest-all-1.3.jar \
    org.junit.runner.JUnitCore JUnitTestSuite
rm *.class eclasstool/tests/*/*.class eclasstool/model/*/*.class \
    eclasstool/view/drawingtools/*.class
