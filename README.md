# Java-Programming
**Programs of Java** :
Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems, which was later acquired by the Oracle Corporation, that provides a system for developing application software and deploying it in a cross-platform computing environment. Java is used in a wide variety of computing platforms from embedded devices and mobile phones to enterprise servers and supercomputers. Java applets, which are less common than standalone Java applications, were commonly run in secure, sandboxed environments to provide many features of native applications through being embedded in HTML pages.

Writing in the Java programming language is the primary way to produce code that will be deployed as byte code in a Java virtual machine (JVM); byte code compilers are also available for other languages, including Ada, JavaScript, Python, and Ruby. In addition, several languages have been designed to run natively on the JVM, including Clojure, Groovy, and Scala. Java syntax borrows heavily from C and C++, but object-oriented features are modeled after Smalltalk and Objective-C.[10] Java eschews certain low-level constructs such as pointers and has a very simple memory model where objects are allocated on the heap (while some implementations e.g. all currently supported by Oracle, may use escape analysis optimization to allocate on the stack instead) and all variables of object types are references. Memory management is handled through integrated automatic garbage collection performed by the JVM.

On November 13, 2006, Sun Microsystems made the bulk of its implementation of Java available under the GNU General Public License (GPL).[11][12]

The latest version is Java 17, released in September 2021. As an open source platform, Java has many distributors, including Amazon, IBM, Azul Systems, and AdoptOpenJDK. Distributions include Amazon Corretto, Zulu, AdoptOpenJDK, and Liberica. Regarding Oracle, it distributes Java 8, and also makes available e.g. Java 11, a currently supported long-term support (LTS) version, released on September 25, 2018. Oracle (and others) "highly recommend that you uninstall older versions of Java" than Java 8,[13] because of serious risks due to unresolved security issues.[14][15][16] Since Java 9 (and 10, 12, 13, 14, 15 and 16) is no longer supported, Oracle advises its users to "immediately transition" to a supported version. Oracle released the last free-for-commercial-use public update for the legacy Java 8 LTS in January 2019, and will continue to support Java 8 with public updates for personal use indefinitely. Oracle extended support for Java 6 ended in December 2018.[17]


Contents
1	Platform
1.1	Java Virtual Machine
1.2	Class libraries
1.3	Languages
1.4	Similar platforms
1.5	Java Development Kit
1.6	Java Runtime Environment
1.6.1	Performance
1.6.2	Generational heap
1.6.3	Security
2	History
2.1	Java meets the Web
2.2	Version history
3	Usage
3.1	Desktop use
4	Mascot
5	Licensing
5.1	Free software
6	Criticism
6.1	Generics
6.2	Unsigned integer types
6.3	Floating point arithmetic
6.4	Performance
6.5	Security
6.6	Adware
6.7	Update system
7	See also
8	References
9	External links
Platform
The Java platform is a suite of programs that facilitate developing and running programs written in the Java programming language. A Java platform includes an execution engine (called a virtual machine), a compiler and a set of libraries; there may also be additional servers and alternative libraries that depend on the requirements. Java platforms have been implemented for a wide variety of hardware and operating systems with a view to enable Java programs to run identically on all of them. Different platforms target different classes of device and application domains:

Java Card: A technology that allows small Java-based applications (applets) to be run securely on smart cards and similar small-memory devices.
Java ME (Micro Edition): Specifies several different sets of libraries (known as profiles) for devices with limited storage, display, and power capacities. It is often used to develop applications for mobile devices, PDAs, TV set-top boxes, and printers.
Java SE (Standard Edition): For general-purpose use on desktop PCs, servers and similar devices.
Jakarta EE (Enterprise Edition): Java SE plus various APIs which are useful for multi-tier client–server enterprise applications.
The Java platform consists of several programs, each of which provides a portion of its overall capabilities. For example, the Java compiler, which converts Java source code into Java bytecode (an intermediate language for the JVM), is provided as part of the Java Development Kit (JDK). The Java Runtime Environment (JRE), complementing the JVM with a just-in-time (JIT) compiler, converts intermediate bytecode into native machine code on the fly. The Java platform also includes an extensive set of libraries.

The essential components in the platform are the Java language compiler, the libraries, and the runtime environment in which Java intermediate bytecode executes according to the rules laid out in the virtual machine specification.

Java Virtual Machine
Main article: Java Virtual Machine
The heart of the Java platform is the "virtual machine" that executes Java bytecode programs. This bytecode is the same no matter what hardware or operating system the program is running under. However, new versions, such as for Java 10 (and earlier), have made small changes, meaning the bytecode is in general only forward compatible. There is a JIT (Just In Time) compiler within the Java Virtual Machine, or JVM. The JIT compiler translates the Java bytecode into native processor instructions at run-time and caches the native code in memory during execution.

The use of bytecode as an intermediate language permits Java programs to run on any platform that has a virtual machine available. The use of a JIT compiler means that Java applications, after a short delay during loading and once they have "warmed up" by being all or mostly JIT-compiled, tend to run about as fast as native programs.[18][19][20] Since JRE version 1.2, Sun's JVM implementation has included a just-in-time compiler instead of an interpreter.

Although Java programs are cross-platform or platform independent, the code of the Java Virtual Machines (JVM) that execute these programs is not. Every supported operating platform has its own JVM.

Class libraries
Main article: Java Class Library
In most modern operating systems (OSs), a large body of reusable code is provided to simplify the programmer's job. This code is typically provided as a set of dynamically loadable libraries that applications can call at runtime. Because the Java platform is not dependent on any specific operating system, applications cannot rely on any of the pre-existing OS libraries. Instead, the Java platform provides a comprehensive set of its own standard class libraries containing many of the same reusable functions commonly found in modern operating systems. Most of the system library is also written in Java. For instance, the Swing library paints the user interface and handles the events itself, eliminating many subtle differences between how different platforms handle components.

The Java class libraries serve three purposes within the Java platform. First, like other standard code libraries, the Java libraries provide the programmer a well-known set of functions to perform common tasks, such as maintaining lists of items or performing complex string parsing. Second, the class libraries provide an abstract interface to tasks that would normally depend heavily on the hardware and operating system. Tasks such as network access and file access are often heavily intertwined with the distinctive implementations of each platform. The java.net and java.io libraries implement an abstraction layer in native OS code, then provide a standard interface for the Java applications to perform those tasks. Finally, when some underlying platform does not support all of the features a Java application expects, the class libraries work to gracefully handle the absent components, either by emulation to provide a substitute, or at least by providing a consistent way to check for the presence of a specific feature.

Languages
See also: List of JVM languages and JVM programming languages
The word "Java", alone, usually refers to Java programming language that was designed for use with the Java platform. Programming languages are typically outside of the scope of the phrase "platform", although the Java programming language was listed as a core part of the Java platform before Java 7. The language and runtime were therefore commonly considered a single unit. However, an effort was made with the Java 7 specification to more clearly treat the Java language and the Java virtual machine as separate entities, so that they are no longer considered a single unit.[21]

Third parties have produced many compilers or interpreters that target the JVM. Some of these are for existing languages, while others are for extensions to the Java language. These include:

BeanShell – A lightweight scripting language for Java[22] (see also JShell)
Ceylon – An object-oriented, strongly statically typed programming language with an emphasis on immutability
Clojure – A modern, dynamic, and functional dialect of the Lisp programming language on the Java platform
Gosu – A general-purpose Java Virtual Machine-based programming language released under the Apache License 2.0
Groovy – A fully Java interoperable, Java-syntax-compatible, static and dynamic language with features from Python, Ruby, Perl, and Smalltalk
JRuby – A Ruby interpreter
Jython – A Python interpreter
Kotlin – An industrial programming language for JVM with full Java interoperability
Rhino – A JavaScript interpreter
Scala – A multi-paradigm programming language with non-Java compatible syntax designed as a "better Java"
Similar platforms
See also: Comparison of the Java and .NET platforms and Comparison of C# and Java
The success of Java and its write once, run anywhere concept has led to other similar efforts, notably the .NET Framework, appearing since 2002, which incorporates many of the successful aspects of Java. .NET was built from the ground-up to support multiple programming languages, while the Java platform was initially built to support only the Java language, although many other languages have been made for JVM since. Like Java, .NET languages compile to byte code and are executed by the Common Language Runtime (CLR), which is similar in purpose to the JVM. Like the JVM, the CLR provides memory management through automatic garbage collection, and allows .NET byte code to run on multiple operating systems.

.NET included a Java-like language first named J++, then called Visual J# that was incompatible with the Java specification. It was discontinued 2007, and support for it ended in 2015.

Java Development Kit
Main article: Java Development Kit
The Java Development Kit (JDK) is a Sun product aimed at Java developers. Since the introduction of Java, it has been by far the most widely used Java software development kit (SDK).[citation needed] It contains a Java compiler, a full copy of the Java Runtime Environment (JRE), and many other important development tools.

Java Runtime Environment
Main article: HotSpot (virtual machine)
The Java Runtime Environment (JRE) released by Oracle is a freely available software distribution containing a stand-alone JVM (HotSpot), the Java standard library (Java Class Library), a configuration tool, and—until its discontinuation in JDK 9—a browser plug-in. It is the most common Java environment installed on personal computers in the laptop and desktop form factor. Mobile phones including feature phones and early smartphones that ship with a JVM are most likely to include a JVM meant to run applications targeting Micro Edition of the Java platform. Meanwhile, most modern smartphones, tablet computers, and other handheld PCs that run Java apps are most likely to do so through support of the Android operating system, which includes an open source virtual machine incompatible with the JVM specification. (Instead, Google's Android development tools take Java programs as input and output Dalvik bytecode, which is the native input format for the virtual machine on Android devices.)

Performance
Main article: Java performance
The JVM specification gives a lot of leeway to implementors regarding the implementation details. Since Java 1.3, JRE from Oracle contains a JVM called HotSpot. It has been designed to be a high-performance JVM.

To speed-up code execution, HotSpot relies on just-in-time compilation. To speed-up object allocation and garbage collection, HotSpot uses generational heap.

Generational heap
The Java virtual machine heap is the area of memory used by the JVM for dynamic memory allocation.[23]

In HotSpot the heap is divided into generations:

The young generation stores short-lived objects that are created and immediately garbage collected.
Objects that persist longer are moved to the old generation (also called the tenured generation). This memory is subdivided into (two) Survivors spaces where the objects that survived the first and next garbage collections are stored.
The permanent generation (or permgen) was used for class definitions and associated metadata prior to Java 8. Permanent generation was not part of the heap.[24][25] The permanent generation was removed from Java 8.[26]

Originally there was no permanent generation, and objects and classes were stored together in the same area. But as class unloading occurs much more rarely than objects are collected, moving class structures to a specific area allowed significant performance improvements.[24]

Security
Oracle's JRE is installed on a large number of computers. End users with an out-of-date version of JRE therefore are vulnerable to many known attacks. This led to the widely shared belief that Java is inherently insecure.[27] Since Java 1.7, Oracle's JRE for Windows includes automatic update functionality.

Before the discontinuation of the Java browser plug-in, any web page might have potentially run a Java applet, which provided an easily accessible attack surface to malicious web sites. In 2013 Kaspersky Labs reported that the Java plug-in was the method of choice for computer criminals. Java exploits are included in many exploit packs that hackers deploy onto hacked web sites.[28] Java applets were removed in Java 11, released on September 25, 2018.

History

James Gosling
The Java platform and language began as an internal project at Sun Microsystems in December 1990, providing an alternative to the C++/C programming languages. Engineer Patrick Naughton had become increasingly frustrated with the state of Sun's C++ and C application programming interfaces (APIs) and tools, as well as with the way the NeWS project was handled by the organization. Naughton informed Scott McNealy about his plan of leaving Sun and moving to NeXT; McNealy asked him to pretend he was God and send him an e-mail explaining how to fix the company. Naughton envisioned the creation of a small team that could work autonomously without the bureaucracy that was stalling other Sun projects. McNealy forwarded the message to other important people at Sun, and the Stealth Project started.[29]

The Stealth Project was soon renamed to the Green Project, with James Gosling and Mike Sheridan joining Naughton. Together with other engineers, they began work in a small office on Sand Hill Road in Menlo Park, California. They aimed to develop new technology for programming next-generation smart appliances, which Sun expected to offer major new opportunities.[30]

The team originally considered using C++, but rejected it for several reasons. Because they were developing an embedded system with limited resources, they decided that C++ needed too much memory and that its complexity led to developer errors. The language's lack of garbage collection meant that programmers had to manually manage system memory, a challenging and error-prone task. The team also worried about the C++ language's lack of portable facilities for security, distributed programming, and threading. Finally, they wanted a platform that would port easily to all types of devices.

Bill Joy had envisioned a new language combining Mesa and C. In a paper called Further, he proposed to Sun that its engineers should produce an object-oriented environment based on C++. Initially, Gosling attempted to modify and extend C++ (a proposed development that he referred to as "C++ ++ --") but soon abandoned that in favor of creating a new language, which he called Oak, after the tree that stood just outside his office.[31]

By the summer of 1992, the team could demonstrate portions of the new platform, including the Green OS, the Oak language, the libraries, and the hardware. Their first demonstration, on September 3, 1992, focused on building a personal digital assistant (PDA) device named Star7[1] that had a graphical interface and a smart agent called "Duke" to assist the user. In November of that year, the Green Project was spun off to become Firstperson, a wholly owned subsidiary of Sun Microsystems, and the team relocated to Palo Alto, California.[32] The Firstperson team had an interest in building highly interactive devices, and when Time Warner issued a request for proposal (RFP) for a set-top box, Firstperson changed their target and responded with a proposal for a set-top box platform. However, the cable industry felt that their platform gave too much control to the user, so Firstperson lost their bid to SGI. An additional deal with The 3DO Company for a set-top box also failed to materialize. Unable to generate interest within the television industry, the company was rolled back into Sun.

Java meets the Web

John Gage
In June and July 1994 – after three days of brainstorming with John Gage (the Director of Science for Sun), Gosling, Joy, Naughton, Wayne Rosing, and Eric Schmidt – the team re-targeted the platform for the World Wide Web. They felt that with the advent of graphical web browsers like Mosaic the Internet could evolve into the same highly interactive medium that they had envisioned for cable TV. As a prototype, Naughton wrote a small browser, WebRunner (named after the movie Blade Runner), renamed HotJava[30] in 1995.

Sun renamed the Oak language to Java after a trademark search revealed that Oak Technology used the name Oak.[33] Although Java 1.0a became available for download in 1994, the first public release of Java, Java 1.0a2 with the HotJava browser, came on May 23, 1995, announced by Gage at the SunWorld conference. Accompanying Gage's announcement, Marc Andreessen, Executive Vice President of Netscape Communications Corporation, unexpectedly announced that Netscape browsers would include Java support. On January 9, 1996, Sun Microsystems formed the JavaSoft group to develop the technology.[34]

While the so-called Java applets for web browsers no longer are the most popular use of Java (with it e.g. more used server-side) or the most popular way to run code client-side (JavaScript took over as more popular), it still is possible to run Java (or other JVM-languages such as Kotlin) in web browsers, even after JVM-support has been dropped from them, using e.g. TeaVM.

Version history
Main article: Java version history
The Java language has undergone several changes since the release of JDK (Java Development Kit) 1.0 on January 23, 1996, as well as numerous additions of classes and packages to the standard library. Since J2SE 1.4 the Java Community Process (JCP) has governed the evolution of the Java Language. The JCP uses Java Specification Requests (JSRs) to propose and specify additions and changes to the Java platform. The Java Language Specification (JLS) specifies the language; changes to the JLS are managed under JSR 901.[35]

Sun released JDK 1.1 on February 19, 1997. Major additions included an extensive retooling of the AWT event model, inner classes added to the language, JavaBeans and JDBC.

J2SE 1.2 (December 8, 1998) – Codename Playground. This and subsequent releases through J2SE 5.0 were rebranded Java 2 and the version name "J2SE" (Java 2 Platform, Standard Edition) replaced JDK to distinguish the base platform from J2EE (Java 2 Platform, Enterprise Edition) and J2ME (Java 2 Platform, Micro Edition). Major additions included reflection, a collections framework, Java IDL (an interface description language implementation for CORBA interoperability), and the integration of the Swing graphical API into the core classes. A Java Plug-in was released, and Sun's JVM was equipped with a JIT compiler for the first time.

J2SE 1.3 (May 8, 2000) – Codename Kestrel. Notable changes included the bundling of the HotSpot JVM (the HotSpot JVM was first released in April, 1999 for the J2SE 1.2 JVM), JavaSound, Java Naming and Directory Interface (JNDI) and Java Platform Debugger Architecture (JPDA).

J2SE 1.4 (February 6, 2002) – Codename Merlin. This became the first release of the Java platform developed under the Java Community Process as JSR 59.[36] Major changes included regular expressions modeled after Perl, exception chaining, an integrated XML parser and XSLT processor (JAXP), and Java Web Start.

J2SE 5.0 (September 30, 2004) – Codename Tiger. It was originally numbered 1.5, which is still used as the internal version number.[37] Developed under JSR 176, Tiger added several significant new language features including the for-each loop, generics, autoboxing and var-args.[38]

Java SE 6 (December 11, 2006) – Codename Mustang. It was bundled with a database manager and facilitates the use of scripting languages with the JVM (such as JavaScript using Mozilla's Rhino engine). As of this version, Sun replaced the name "J2SE" with Java SE and dropped the ".0" from the version number.[39] Other major changes include support for pluggable annotations (JSR 269), many GUI improvements, including native UI enhancements to support the look and feel of Windows Vista, and improvements to the Java Platform Debugger Architecture (JPDA) & JVM Tool Interface for better monitoring and troubleshooting.

Java SE 7 (July 28, 2011) – Codename Dolphin. This version developed under JSR 336.[40] It added many small language changes including strings in switch, try-with-resources and type inference for generic instance creation. The JVM was extended with support for dynamic languages, while the class library was extended among others with a join/fork framework,[41] an improved new file I/O library and support for new network protocols such as SCTP. Java 7 Update 76 was released in January 2015, with expiration date April 14, 2015.[42]

In June 2016, after the last public update of Java 7,[43] "remotely exploitable" security bugs in Java 6, 7, and 8 were announced.[15]

Java SE 8 (March 18, 2014) – Codename Kenai. Notable changes include language-level support for lambda expressions (closures) and default methods, the Project Nashorn JavaScript runtime, a new Date and Time API inspired by Joda Time, and the removal of PermGen. This version is not officially supported on the Windows XP platform.[44] However, due to the end of Java 7's lifecycle it is the recommended version for XP users. Previously, only an unofficial manual installation method had been described for Windows XP SP3. It refers to JDK8, the developing platform for Java that also includes a fully functioning Java Runtime Environment.[45] Java 8 is supported on Windows Server 2008 R2 SP1, Windows Vista SP2 and Windows 7 SP1, Ubuntu 12.04 LTS and higher (and some other OSes).[46]

Java SE 9 and 10 had higher system requirements, i.e. Windows 7 or Server 2012 (and web browser minimum certified is upped to Internet Explorer 11 or other web browsers), and Oracle dropped 32-bit compatibility for all platforms, i.e. only Oracle's "64-bit Java virtual machines (JVMs) are certified".[47]

Java SE 11 was released September 2018, the first LTS release since the rapid release model was adopted starting with version 9. For the first time, OpenJDK 11 represents the complete source code for the Java platform under the GNU General Public License, and while Oracle still dual-licenses it with an optional proprietary license, there are no code differences nor modules unique to the proprietary-licensed version.[48] Java 11 features include two new garbage collector implementations, Flight Recorder to debug deep issues, a new HTTP client including WebSocket support.[49]

Java SE 12 was released March 2019.[50]

Java SE 13 was released September 2019.[51]

Java SE 14 was released March 2020.[52]

Java SE 15 was released September 2020.

Java SE 16 was released March 2021.

Java SE 17 was released September 2021.


In addition to language changes, significant changes have been made to the Java class library over the years, which has grown from a few hundred classes in JDK 1.0 to over three thousand in J2SE 5.0. Entire new APIs, such as Swing and Java 2D, have evolved, and many of the original JDK 1.0 classes and methods have been deprecated.

Usage
Desktop use

A Java program running on a Windows Vista desktop computer (supported by Java 8, but not officially by later versions, such as Java 11)
According to Oracle in 2010, the Java Runtime Environment was found on over 850 million PCs.[53] Microsoft has not bundled a Java Runtime Environment (JRE) with its operating systems since Sun Microsystems sued Microsoft for adding Windows-specific classes to the bundled Java runtime environment, and for making the new classes available through Visual J++.[citation needed] Apple no longer includes a Java runtime with OS X as of version 10.7, but the system prompts the user to download and install it the first time an application requiring the JRE is launched.[citation needed] Many Linux distributions include the OpenJDK runtime as the default virtual machine, negating the need to download the proprietary Oracle JRE.[54]

Some Java applications are in fairly widespread desktop use, including the NetBeans and Eclipse integrated development environments, and file sharing clients such as LimeWire and Vuze. Java is also used in the MATLAB mathematics programming environment, both for rendering the user interface and as part of the core system. Java provides cross platform user interface for some high end collaborative applications such as Lotus Notes.

Oracle plans to first deprecate the separately installable Java browser plugin from the Java Runtime Environment in JDK 9 then remove it completely from a future release, forcing web developers to use an alternative technology.[55]

Mascot

Plain ol' Duke
Duke is Java's mascot.[56]

When Sun announced that Java SE and Java ME would be released under a free software license (the GNU General Public License), they released the Duke graphics under the free BSD license at the same time.[57] A new Duke personality is created every year.[58] For example, in July 2011 "Future Tech Duke" included a bigger nose, a jetpack, and blue wings.[59]

Licensing
The source code for Sun's implementations of Java (i.e. the de facto reference implementation) has been available for some time, but until recently,[60] the license terms severely restricted what could be done with it without signing (and generally paying for) a contract with Sun. As such these terms did not satisfy the requirements of either the Open Source Initiative or the Free Software Foundation to be considered open source or free software, and Sun Java was therefore a proprietary platform.[61]

While several third-party projects (e.g. GNU Classpath and Apache Harmony) created free software partial Java implementations, the large size of the Sun libraries combined with the use of clean room methods meant that their implementations of the Java libraries (the compiler and VM are comparatively small and well defined) were incomplete and not fully compatible. These implementations also tended to be far less optimized than Sun's.[citation needed]

Free software
See also: OpenJDK

Jonathan I. Schwartz
Sun announced in JavaOne 2006 that Java would become free and open source software,[62] and on October 25, 2006, at the Oracle OpenWorld conference, Jonathan I. Schwartz said that the company was set to announce the release of the core Java Platform as free and open source software within 30 to 60 days.[63]

Sun released the Java HotSpot virtual machine and compiler as free software under the GNU General Public License on November 13, 2006, with a promise that the rest of the JDK (that includes the JRE) would be placed under the GPL by March 2007 ("except for a few components that Sun does not have the right to publish in distributable source form under the GPL").[64] According to Richard Stallman, this would mean an end to the "Java trap".[65] Mark Shuttleworth called the initial press announcement, "A real milestone for the free software community".[66]

Sun released the source code of the Class library under GPL on May 8, 2007, except some limited parts that were licensed by Sun from third parties who did not want their code to be released under a free software and open-source license.[67] Some of the encumbered parts turned out to be fairly key parts of the platform such as font rendering and 2D rasterising, but these were released as open-source later by Sun (see OpenJDK Class library).

Sun's goal was to replace the parts that remain proprietary and closed-source with alternative implementations and make the class library completely free and open source. In the meantime, a third-party project called IcedTea created a completely free and highly usable JDK by replacing encumbered code with either stubs or code from GNU Classpath. However OpenJDK has since become buildable without the encumbered parts (from OpenJDK 6 b10[68]) and has become the default runtime environment for most Linux distributions.[69][70][71][72]

In June 2008, it was announced that IcedTea6 (as the packaged version of OpenJDK on Fedora 9) has passed the Technology Compatibility Kit tests and can claim to be a fully compatible Java 6 implementation.[73]

Because OpenJDK is under the GPL, it is possible to redistribute a custom version of the JRE directly with software applications,[74][75] rather than requiring the enduser (or their sysadmin) to download and install the correct version of the proprietary Oracle JRE onto each of their systems themselves.

Criticism
Main article: Criticism of Java
In most cases, Java support is unnecessary in Web browsers, and security experts recommend that it not be run in a browser unless absolutely necessary.[76] It was suggested that, if Java is required by a few Web sites, users should have a separate browser installation specifically for those sites.[citation needed]

Generics
Further information: Generics in Java
When generics were added to Java 5.0, there was already a large framework of classes (many of which were already deprecated), so generics were chosen to be implemented using erasure to allow for migration compatibility and re-use of these existing classes. This limited the features that could be provided by this addition as compared to some other languages.[77][78] The addition of type wildcards made Java unsound.[79]

Unsigned integer types
Java lacks native unsigned integer types. Unsigned data are often generated from programs written in C and the lack of these types prevents direct data interchange between C and Java. Unsigned large numbers are also used in many numeric processing fields, including cryptography, which can make Java less convenient to use for these tasks.[80] Although it is possible to partially circumvent this problem with conversion code and using larger data types, it makes using Java cumbersome for handling the unsigned data. While a 32-bit signed integer may be used to hold a 16-bit unsigned value with relative ease, a 32-bit unsigned value would require a 64-bit signed integer. Additionally, a 64-bit unsigned value cannot be stored using any integer type in Java because no type larger than 64 bits exists in the Java language. If abstracted using functions, function calls become necessary for many operations which are native to some other languages. Alternatively, it is possible to use Java's signed integers to emulate unsigned integers of the same size, but this requires detailed knowledge of complex bitwise operations.[81]

Floating point arithmetic
While Java's floating point arithmetic is largely based on IEEE 754 (Standard for Binary Floating-Point Arithmetic), certain features are not supported even when using the strictfp modifier, such as Exception Flags and Directed Roundings – capabilities mandated by IEEE Standard 754. Additionally, the extended precision floating-point types permitted in 754 and present in many processors are not permitted in Java.[82][83]

Performance
Further information: Java performance
In the early days of Java (before the HotSpot VM was implemented in Java 1.3 in 2000) there were some criticisms of performance. Benchmarks typically reported Java as being about 50% slower than C (a language which compiles to native code).[84][85][86]

Java's performance has improved substantially since the early versions.[18] Performance of JIT compilers relative to native compilers has in some optimized tests been shown to be quite similar.[18][19][20]

Java bytecode can either be interpreted at run time by a virtual machine, or it can be compiled at load time or runtime into native code which runs directly on the computer's hardware. Interpretation is slower than native execution, and compilation at load time or runtime has an initial performance penalty for the compilation. Modern performant JVM implementations all use the compilation approach, so after the initial startup time the performance is equivalent to native code.

Security
Further information: Java security
The Java platform provides a security architecture[87] which is designed to allow the user to run untrusted bytecode in a "sandboxed" manner to protect against malicious or poorly written software. This "sandboxing" feature is intended to protect the user by restricting access to certain platform features and APIs which could be exploited by malware, such as accessing the local filesystem, running arbitrary commands, or accessing communication networks.

In recent years, researchers have discovered numerous security flaws in some widely used Java implementations, including Oracle's, which allow untrusted code to bypass the sandboxing mechanism, exposing users to malicious attacks. These flaws affect only Java applications which execute arbitrary untrusted bytecode, such as web browser plug-ins that run Java applets downloaded from public websites. Applications where the user trusts, and has full control over, all code that is being executed are unaffected.

On August 31, 2012, Java 6 and 7 (both supported back then) on Microsoft Windows, OS X, and Linux were found to have a serious security flaw that allowed a remote exploit to take place by simply loading a malicious web page.[88] Java 5 was later found to be flawed as well.[89]

On January 10, 2013, three computer specialists spoke out against Java, telling Reuters that it was not secure and that people should disable Java. Jaime Blasco, Labs Manager with AlienVault Labs, stated that "Java is a mess. It's not secure. You have to disable it." This vulnerability affects Java 7 and it is unclear if it affects Java 6, so it is suggested that consumers disable it.Security alerts from Oracle announce schedules of critical security-related patches to Java.

On January 14, 2013, security experts said that the update still failed to protect PCs from attack.[94] This exploit hole prompted a response from the United States Department of Homeland Security encouraging users to disable or uninstall Java. Apple blacklisted Java in limited order for all computers running its OS X operating system through a virus protection program.

In 2014 and responding to then-recent Java security and vulnerability issues, security blogger Brian Krebs has called for users to remove at least the Java browser plugin and also the entire software. "I look forward to a world without the Java plugin (and to not having to remind readers about quarterly patch updates) but it will probably be years before various versions of this plugin are mostly removed from end-user systems worldwide."Once promising, it has outlived its usefulness in the browser, and has become a nightmare that delights cyber-criminals at the expense of computer users."I think everyone should uninstall Java from all their PCs and Macs, and then think carefully about whether they need to add it back. If you are a typical home user, you can probably do without it. If you are a business user, you may not have a choice."

**Adware**:
The Java runtime environment has a history of bundling sponsored software to be installed by default during installation and during the updates which roll out every month or so. This includes the "Ask.com toolbar" that will redirect browser searches to ads and "McAfee Security Scan Plus".These offers can be blocked through a setting in the Java Control Panel, although this is not obvious. This setting is located under the "Advanced" tab in the Java Control Panel, under the "Miscellaneous" heading, where the option is labelled as an option to suppress "sponsor offers".
**Update system** :
Java has yet to release an automatic updater that does not require user intervention and administrative rights unlike Google Chrome and Flash player.
