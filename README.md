# Grails Jasmine Resources Plugin

This plugin adds [Jasmine](http://pivotal.github.com/jasmine/) resources to the Grails Application.

It uses new [Resources Plugin](http://grails.org/plugin/resources) to handle resources gracefully.
Just let your Jasmine Specs depend on 'jasmine' module and it's done. There is also controller for
standalone manual testing. Just navigate to `<app>/jasmine/<module-name>` to see the results.

If jQuery plugin is installed it automatically adds [jQuery Jasmine](https://github.com/velesin/jasmine-jquery) script.

To install the plugin just type

```
  grails install-plugin jasmine-resources
```

