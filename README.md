Continuous Integration
======================

Continuous Integration is a development technique that mandates frequent
synchronization of each developers code base with the shared repository,
where  automated building and often automated testing will take place.

Concepts
--------
- Single shared source repository
- Each developer pulls+pushes multiple times per day
- Each push is automatically tested and built
- Any errors during testing or building alert the team and
are fixed asap


Benefits
--------
* Errors can be found faster since automated building and testing will 
occur more often
* Many commits mean less history to analyze when problems occur, so
less time is spent searching for a problem.
* Integrating quickly is less time consuming since almost always you
can fast forward merge your changes
* Everybody will see your code changes and working faster, which is a form of
more communication and faster feedback

Drawbacks
---------
* Maybe not alot of time is saved, since the integration (though cheep)
is required to be done so frequently (many times a day).
* Depending on how much time you take to create a good healthy snapshot of your work that
compiles, that has a good commit message, that passes all tests...there
might be quite a lot of wasted time even.
* Larger tasks are often not sensibly chopped down into mouth sized chunks that
can be fed into the repository in bite sized portions...it makes a lot more sense
to work in a branch for a few days and then bite the bullet and merge then.
* Concentration on the thing you are trying to improve can be broken by the constant
updates and changes in your world. 


An interesting blog that gives some thought on how it is often good to take
your time and do something thoughtfully instead of blasting out micro commits
can be found here:

[link](http://ventrellathing.wordpress.com/2013/06/18/the-case-for-slow-programming/)

