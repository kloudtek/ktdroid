ktdroid
=======

Android framework used to make developer's life easier

Quick Start
-----------

Add the maven plugin to your build script

'''
<plugin>
    <groupId>com.kloudtek.ktdroid</groupId>
    <artifactId>ktdroid-maven-plugin</artifactId>
    <version>${ktdroid.version}</version>
</plugin>
'''

Please note it is very important that this plugin be located BEFORE tha android maven plugin, otherwise
proguard will be run first, which will cause the ktdroid plugin to not work

ie:

'''
<plugin>
    <groupId>com.kloudtek.ktdroid</groupId>
    <artifactId>ktdroid-maven-plugin</artifactId>
    <version>${ktdroid.version}</version>
</plugin>
<plugin>
    <groupId>com.jayway.maven.plugins.android.generation2</groupId>
    <artifactId>android-maven-plugin</artifactId>
    <version>${android.plugin.version}</version>
</plugin>
'''