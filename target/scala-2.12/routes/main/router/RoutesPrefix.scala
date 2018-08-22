// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lakshmik/work/angular-play/conf/routes
// @DATE:Fri Aug 03 14:27:44 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
