# Appium Installation And Run The Test

# Step-1: Install JAVA JDK (Ignore if you alreday had it)
    
You should go to the below link and install JAVA JDK for MAC OS.

https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

After installation checks the below path to find JAVA HOME, for my version it is as shown below.

/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home

![image](https://user-images.githubusercontent.com/89891201/205619346-4d26f63b-3682-4b1b-a6f5-c08b97e41f63.png)

Then set JAVA_HOME on your Mac as shown below:

    - export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_192.jdk/Contents/Home

Then, run the below command to check your JAVA_HOME.

    - echo $JAVA_HOME

If you have MAC OS 10.5 or newer you can just use the below lines:

    - export JAVA_HOME=$(/usr/libexec/java_home)
    - export PATH=$JAVA_HOME/bin:$PATH

then source the profile file:

    - source ~/.profile

Then check the result:

    - echo $JAVA_HOME

![image](https://user-images.githubusercontent.com/89891201/205620611-117332bd-7fbc-4175-8a5f-9f55ddb9ec92.png)


# Step-2: Install Android Studio
    
You need to go to the below address, download Android Studio for Mac, and do the following as stated below.

https://developer.android.com/studio/

[1] To install Android Studio on your Mac, proceed as follows:

  1. Launch the Android Studio DMG file.
  2. Drag and drop Android Studio into the Applications folder, then launch Android Studio.
  3. Select whether you want to import previous Android Studio settings, then click OK.
  4. The Android Studio Setup Wizard guides you through the rest of the setup, which includes downloading Android SDK components that are required for the development
  
When u open and select the default settings, Android Studio will start to download the required libraries as shown below.
![image](https://user-images.githubusercontent.com/89891201/205621437-c088e229-595c-4fa5-bbd9-da8afe20d4df.png)
![image](https://user-images.githubusercontent.com/89891201/205621552-0ea381a7-9af3-46f4-9689-8d5d17444e88.png)

Do below settings in .profile file. Open a terminal and type

    - nano ~/.profile

Then, paste the below commands: (Change your user name! Not use my username “onur”).

    - export ANDROID_HOME=/Users/onur/Library/Android/sdk

    - export PATH=$ANDROID_HOME/platform-tools:$PATH

    - export PATH=$ANDROID_HOME/tools:$PATH
    - export PATH=$ANDROID_HOME/tools/bin:$PATH

![image](https://user-images.githubusercontent.com/89891201/205622169-93cd0756-efb1-487f-82a9-e56038f13ad1.png)


# Step-3: Install Homebrew
    
Open a terminal window and run the below command to install brew:
 
    - /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
![image](https://user-images.githubusercontent.com/89891201/205624258-9171fd7d-544b-43aa-ad80-9a03f98c08e3.png)

Close all terminal windows and reopen a terminal window and check the Android home by typing the below command:

    - echo $ANDROID_HOME

![image](https://user-images.githubusercontent.com/89891201/205624450-63048bdb-25ec-4d68-a24a-f079972a7691.png)


# Step-4: Install Node.js and npm
  
Go to https://nodejs.org/en/download/ download and install node package. It is pretty straightforward.

To see if Node is installed, type in node -v  Terminal.

To see if NPM is installed, type in npm -v  Terminal.

In order to update Node and NPM, you can use Homebrew to update these two:

  1. Make sure Homebrew has the latest version of the Node package. In Terminal type brew update 
  2. Upgrade Node: brew upgrade node 


# Step-5: Install Appium on Terminal
In order to install appium via terminal you need to run the below commands:

    - npm install -g appium #get appium
    - npm install wd #get appium client




# Step-6: Download Appium Desktop
    
Let’s go to this link: https://github.com/appium/appium-desktop/releases/  and download appium for mac. You should click and download .dgm file. For example, “Appium-mac-1.20.2.dmg“. When the download finishes, double click the .dgm file and drag and drop the Appium into Applications as shown below.

![image](https://user-images.githubusercontent.com/89891201/205629098-5e4a24f8-f6da-49bf-950d-1c0030cc5093.png)

Then, you will see the appium logo in your applications when you click on the launchpad icon as shown below.
![image](https://user-images.githubusercontent.com/89891201/205629249-6767ded1-0861-4b6f-b336-fbb65e3f9f01.png)

# Step-7: Install Maven

It is used for building and managing Java-based projects by using dependencies. Open a terminal and run the below command.

    - brew install maven
    
Then, check the installation with the below command:

    - mvn -version

# Step-8: Run the tests

  1. Clone the project
  2. Install all the maven dependency on pom.xml
  <img width="1431" alt="Screenshot 2022-12-05 at 6 15 02 PM" src="https://user-images.githubusercontent.com/89891201/205635081-30e8accb-d10a-41ac-9abe-85ef7c2eb9fa.png">
  
  3. Open Android studio
  4. Start an emulator
  <img width="1431" alt="Screenshot 2022-12-05 at 5 47 52 PM" src="https://user-images.githubusercontent.com/89891201/205630154-3f5d2a9b-8939-4990-9a04-607391acf48c.png">

  5. Install Koala lab & Mod Pizza staging apps on the emulator (drag & drop the apk's on emulator)
  6. Open Appium Desktop
  7. Start appium server
  <img width="1431" alt="Screenshot 2022-12-05 at 6 02 28 PM" src="https://user-images.githubusercontent.com/89891201/205634825-82166ea8-8868-45c9-96e2-eaa9b4bbc2b6.png">

  8. Run the test cases via IDE
  <img width="1431" alt="Screenshot 2022-12-05 at 6 00 49 PM" src="https://user-images.githubusercontent.com/89891201/205632523-50b78575-3a9c-4106-8240-98627a5be719.png">

  
  
  
