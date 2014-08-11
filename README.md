Lazybones Templates Project
==============================

This is the project for all of [Webonise](http://webonise.com)'s
[Lazybones](http://github.compledbrook/lazybones) templates. These templates are used for
bootstrapping new projects. Once the project is bootstrapped with lazybones, it can also
be used for creating subtemplates.

If you've used Rails, Middleman, or Grails, this is the `generate` command as a portable and
standalone utility. Pretty sweet, huh?

Creating New Templates
------------------------

To get started, simply create new directories under the `templates` directory
and put the source of the different project templates into them. You can then
package and install the templates locally with the command:

    ./gradlew installAllTemplates

This lets you create the projects from each of the templates locally. This is
how you can test that the templates produce exactly what you want and no more.

You will want to create a `VERSION` file at the root of the template. This file
should contain just the version number. For more information, see
[the README](http://github.com/pledbrook/lazybones#template-versions).

You can find out more about creating templates on [the GitHub wiki][1].

[1]: http://github.com/pledbrook/lazybones/wiki/Template-developers-guide


Publishing Templates
----------------------

If you then want to distribute templates, you will need to set up your Bintray account
credentials. Create a file at `~/.gradle/gradle.properties` containing the following:

```
bintrayUsername = "webonise"
bintrayApiKey =  // From our intranet wiki page on Bintray
```

When that's done, you can publish the templates with

    ./gradlew publishAllTemplates
