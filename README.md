# Grails Jasmine Resources Plugin

*This plugin is no longer maintained as the [asset-pipeline](http://grails.org/plugin/asset-pipeline) plugin is now the standard in grails applications.*

This plugin adds [Jasmine](https://jasmine.github.io/) resources to your Grails Application.

> Jasmine is a behavior-driven development framework for testing JavaScript code. It does not depend on any other JavaScript frameworks. It does not require a DOM. And it has a clean, obvious syntax so that you can easily write tests.

It uses the [Resources Plugin](http://grails.org/plugin/resources) to handle resources gracefully. All you need to do is create a resource module with your Jasmine specs that depend on the 'jasmine' module. There is also a controller for standalone manual testing. Just navigate to `<app>/jasmine/<module-name>` to access the spec runner.

If the Grails jQuery plugin is installed, the [Jasmine-jQuery](https://github.com/velesin/jasmine-jquery) script will be automatically included in the spec runner.

## Usage
Add the plugin to the `plugins` block of your `BuildConfig.groovy`:

```groovy
compile ":jasmine-resources:0.1.2"
```

To add Jasmine specs to your grails project:

* Install the plugin.
* Reference your Jasmine spec files in your ApplicationResources file, or wherever you are defining your resources. This example assumes spec files are located within `web-app/js/spec/`, and source files in `web-app/js/src/`.

```groovy
modules = {
    'example' {
        dependsOn 'jasmine'
        resource url: 'js/src/Player.js', disposition: 'head'
        resource url: 'js/src/Song.js', disposition: 'head'
        resource url: 'js/spec/SpecHelper.js', disposition: 'head'
        resource url: 'js/spec/PlayerSpec.js', disposition: 'head'
    }
}
```

The example module above is included with the plugin and is viewable at `<app>/jasmine/example`.
