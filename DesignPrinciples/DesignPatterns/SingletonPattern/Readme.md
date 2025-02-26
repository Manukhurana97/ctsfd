<h1> Singleton</h1>

<ul>
  <li>A SIngleton class has only one instance, accessible globally through a single point (via a method / field)</li>
  <li> Main problem this pattern solves is too ensure that only a single instance of this class exists.
  <li> any state you add in your singleton becanme part of "global state" ofyyour application.
</ul> 

<br>
<h2>Implementtation</h2>
<ul>
  <li>Controlling instance creation </li>
  <ul>
    <li> Class constructor must be accessible globally</li>
    <li>Subclassing / instance must be allowed </li>
  </ul>
  <li> Keeping track of instance</li>
  <ul>
    <li>Class itself is a good place to track the instance</li>
  </ul>
  <li>Giving access to the singleton Instance</li>
  <ul>
    <li> A public static method is good choice </li>
    <li> Can expose instance as final public static field but it won't work for all the singleton implementations </li>
  </ul>
 </ul>
  
  
  ** there are 2 ways to implements singleton pattern **
  - Early inilialization - Eager singleton
     -  Create singleton as soon as class is loaded.
  -  Lazy inilialization - Lazy Singleton
     -  singleton is created when it is first required.
     
     
 <br>    
 <h2> Implementation Considerations </h2>
 <ul>
   <li> Eager/ratly initialization is simplest & preferred way, Always try to use this approach first. </li>
   <li> the classic singleton pattern implementation uses double check locking and volatile field.</li>
   <li> The lazy inilialization holder idiom provides best of bothe words , you deal with synchronization issues directly asd is easy to implement. </li>
   <li> If the sime solution works then  use it.</li>
 </ul>
 
 
 <br>
 <h2>Pitfall</h2>
 <ul>
  <li>Singleton pattern can deceive you about true dependencies! Since they are globally accessible its eays to miss dependencies.</li>
  <li>They are hard to unit test, you cannot easily mock the inetance that is returned.</li>
  <li>Single is implemented via static variable which is held per class loader and not per JVM. so thet are not truly singleton.</li>
</ul>
 
<br>
<h2>Example</h2>
- Java.lang.Runtime (private static Runtime runtime = new Runtime();)    
