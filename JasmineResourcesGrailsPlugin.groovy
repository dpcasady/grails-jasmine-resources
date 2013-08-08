class JasmineResourcesGrailsPlugin {
	def version = "0.1.1"
	def grailsVersion = "2.0 > *"
	def pluginExcludes = [
		"grails-app/conf/TestResources.groovy",
	]

	def title = "Jasmine Resources Plugin"
	def description = 'Jasmine resources plugin'
	def documentation = "http://grails.org/plugin/jasmine-resources"

	def license = "APACHE"
	def developers = [
		[name: 'Vladimír Oraný', email: 'vladimir.orany@appsatori.eu'],
		[name: 'Danny Casady', email: 'dpcasady@gmail.com']
	]
	def issueManagement = [system: "JIRA", url: 'https://github.com/dpcasady/grails-jasmine-resources/issues']
	def scm = [url: 'https://github.com/dpcasady/grails-jasmine-resources']
}
