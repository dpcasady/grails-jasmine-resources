modules = {
  'test' {
    dependsOn 'jasmine'
    resource url: 'js/src/Player.js', disposition: 'head'
    resource url: 'js/src/Song.js', disposition: 'head'
    resource url: 'js/spec/SpecHelper.js', disposition: 'head'
    resource url: 'js/spec/PlayerSpec.js', disposition: 'head'
  }
}
