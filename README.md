# Grails Jasmine Resources Plugin

This plugin adds [Jasmine](http://pivotal.github.com/jasmine/) resources to your Grails Application.

It uses the [Resources Plugin](http://grails.org/plugin/resources) to handle resources gracefully. All you need to do is create a resource module with your Jasmine specs that depend on the 'jasmine' module. There is also controller for standalone manual testing. Just navigate to `<app>/jasmine/<module-name>` to see the results.

If the Grails jQuery plugin is installed, it automatically adds the [jQuery Jasmine](https://github.com/velesin/jasmine-jquery) script to the spec runner.

## Usage
Add the plugin to the `plugins` block of your `BuildConfig.groovy`:

```groovy
compile ":jasmine-resources:0.1.1"
```

To add Jasmine specs to your grails project:

* Install the plugin.
* Reference your Jasmine spec files in your ApplicationResources file, or wherever you are defining your resources. This example assumes spec files are located within `web-app/plugins/js/`.

```groovy
modules = {

	'test' {
		dependsOn 'jasmine'
		resource url: 'plugins/js/Player.js', disposition: 'head'
		resource url: 'plugins/js/Song.js', disposition: 'head'
		resource url: 'plugins/js/SpecHelper.js', disposition: 'head'
		resource url: 'plugins/js/PlayerSpec.js', disposition: 'head'
	}

}
```
