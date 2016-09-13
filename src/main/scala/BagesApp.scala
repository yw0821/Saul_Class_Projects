/**
 * Created by Parisa on 9/13/16.
 */
import BadgeClassifiers._
import scala.collection.JavaConversions._
object BadgesApp extends App{

  val allNamesTrain= new BadgeReader("data/badges/badges.train").badges
  val allNamesTest= new BadgeReader("data/badges/badges.test").badges

  BadgeDataModel.badge.populate(allNamesTrain)
  BadgeDataModel.badge.populate(allNamesTest,false)

  BadgeClassifier.learn(5)
  BadgeClassifier.test()
}
