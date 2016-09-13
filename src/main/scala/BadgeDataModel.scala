import edu.illinois.cs.cogcomp.saul.datamodel.DataModel

/**
 * Created by Parisa on 9/13/16.
 */
object BadgeDataModel extends DataModel{

  val badge= node[String]

  val BadgeFeature1= property(badge){
    x: String => {
      val tokens= x.split(" ")
      tokens(1).charAt(1).toString
    }
  }

  val BadgeLabel =property(badge){
    x: String => {
      val tokens= x.split(" ")
      if (tokens(0).equals("+"))
        "positive"
      else
        "negative"
    }
  }
}
