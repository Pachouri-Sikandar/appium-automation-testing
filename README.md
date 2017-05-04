# appium-automation-testing
Understanding Appium

## Note - I do not claim that this is my original work. This is just a compilation of the open source available information and tried to make it easier to understand and implement.


### What is Appium? and Why to use?
* Appium is an open-source tool for automation testing for mobile applications. 
* Appium can be used to test native, hybrid and mobile web applications on both Android and iOS platforms. 
* It is a cross-platform tool which allows to write test againts multiple platforms using the same API. 
* This reduces the efforts to rewrite code for different platforms and the same code can be reused for all the platforms.
* Appium allows to choose the language to write the tests.
* Appium supports automation tests on Physical devices and Emulator/Simulator.

#### Write tests in any language like Java, Ruby, Python, PHP etc. as per your convenience and use them to automate Android and iOS, isn't that sound cool !!

### Installation Requirements :
    Prerequisites or tools needed to complete the Appium installation.
    1. Install JDK (prefer the latest one)
    2. Get and install any IDE of your choice (Eclipse, IntelliJ IDEA, etc.)
    3. Android SDK
    4. Install Appium
      
Links to download the above tools / softwares - 
1. JDK - http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html (choose your OS and the latest version of JDK to install)

2. IntelliJ IDEA - http://www.jetbrains.com/idea/download/#section=linux (Choose your OS)

3. Android SDK - https://developer.android.com/studio/index.html (Scroll to bottom and choose to download the sdk with respect to OS)

##### Assuming the first 3 required installations are already done. As we are learning for Appium, lets start with installing Appium

### Installing Appium

If you are using a Mac or Windows machine then you are fortunate enough to enjoy the ready to install desktop apps. 

    Visit this link to download the apps - https://github.com/appium/appium-desktop/releases/tag/v1.0.0
    (Please download .dmg file for mac users and .exe file for Windows)

But if you are using Ubuntu or learn to hack using terminal on Windows and Mac also. So, lets get started.

    Visit this link for help - http://appium.io/

To begin we need to install brew and npm (Node package manager, an online repository for publising open source Node.js projects) first.
Open the terminal and type the following commands one by one. 
Remember these are the installation commands for these softwares so please wait for them to finish with the installation. It depends on your internet speed.

    1. brew install node            # get node.js
    2. npm install -g appium        # get appium
    3. npm install wd               # get appium client
    4. appium &                     # start appium

Cheers!!   We are done with the appium installation.




