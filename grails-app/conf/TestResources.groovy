def dev = grails.util.GrailsUtil.isDevelopmentEnv()
def applicationContext = org.codehaus.groovy.grails.commons.ApplicationHolder.application.mainContext
def jqueryPlugin = applicationContext.pluginManager.getGrailsPlugin('jquery')

def jsFile = dev ? "angular.js" :"angular.min.js"

modules = {
	'test' {
		dependsOn 'jasmine'
		resource url: 'plugins/js/Player.js', disposition: 'head'
		resource url: 'plugins/js/Song.js', disposition: 'head'
		resource url: 'plugins/js/SpecHelper.js', disposition: 'head'
		resource url: 'plugins/js/PlayerSpec.js', disposition: 'head'
    }
}
