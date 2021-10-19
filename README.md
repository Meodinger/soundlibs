# soundlibs-module

For some reason I need to play ogg music in my project, and the project uses `jpackage` to bundle.
As we know `jpackage` works poor with automatic modules (modules without `module-info.java`).
Unfortunately, packages in `com.google.soundlibs` is not modular cause they weren't updated anymore
from 2016 (actually the source code wasn't updated from 2006). In the mean time, I don't want to
use `jdeps` and `jlink` to generate custom runtime image. So I cloned the repo, added `module-info.java`
and re-complied the source.

Then we got soundlibs-module.

## Maybe

The source code is so old that I got many warnings while compiling. Maybe in the future I'll rewrite
them all in JDK11 for stability and studying the principles of sound-processing
