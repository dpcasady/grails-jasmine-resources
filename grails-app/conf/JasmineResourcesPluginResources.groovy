def applicationContext = org.codehaus.groovy.grails.commons.ApplicationHolder.application.mainContext
def jqueryPlugin = applicationContext.pluginManager.getGrailsPlugin('jquery')

modules = {
	'jasmine' {
		defaultBundle 'jasmine'
		resource id: 'jasmine-favicon',url: [plugin: 'jasmine-resources', dir:'images/jasmine', file: 'jasmine_favicon.png'], attrs: [rel: 'shortcut icon'], disposition: 'head'
		resource id: 'jasmine-css', url: [plugin: 'jasmine-resources', dir:'css/jasmine', file: 'jasmine.css'], disposition: 'head'
		resource id: 'jasmine', url: [plugin: 'jasmine-resources', dir:'js/jasmine', file: 'jasmine.js'], disposition: 'head'
		resource id: 'jasmine-html', url: [plugin: 'jasmine-resources', dir:'js/jasmine', file: 'jasmine-html.js'], disposition: 'head'
		if (jqueryPlugin) {
			dependsOn 'jquery'
			resource id: 'jasmine-jquery', url: [plugin: 'jasmine-resources', dir:'js/jasmine', file: 'jasmine-jquery.js'], disposition: 'head'
		}
		resource id: 'jasmine-reporter', url: [plugin: 'jasmine-resources', dir:'js/jasmine', file: 'jasmine-reporter.js'], disposition: 'head'
    }
}
