modules = {
	'test' {
		dependsOn 'jasmine'
		resource url: 'plugins/js/Player.js', disposition: 'head'
		resource url: 'plugins/js/Song.js', disposition: 'head'
		resource url: 'plugins/js/SpecHelper.js', disposition: 'head'
		resource url: 'plugins/js/PlayerSpec.js', disposition: 'head'
    }
}
