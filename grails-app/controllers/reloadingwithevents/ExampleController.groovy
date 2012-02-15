package reloadingwithevents

class ExampleController {

    def index() {
      def output = "output"
      // output += ' changed' // uncomment this
      render text: output
    }
}
