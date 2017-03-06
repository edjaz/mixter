package mixter.domain.identity

trait SessionRepository {
  def save(sessionProjection: SessionProjection):Unit
  def replaceBy(sessionProjection: SessionProjection):Unit
  def getById(id:SessionId):Option[SessionProjection]
}
