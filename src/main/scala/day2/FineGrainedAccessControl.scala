/**
  * Created by sin13cos14 on 16/10/13  00:24.
  */
package society {
  package professional {

    class Executive {
      private[professional] var workDetail = null
      private[society] var friends = null
      private[this] var secrets = null

      def help(another: Executive): Unit = {
        println(another.workDetail)
        println(another.friends)
        //println(another.secrets)// ERROR
      }
    }

  }

}