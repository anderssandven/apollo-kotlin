// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_with_inline_fragment.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.example.fragment_with_inline_fragment.fragment.adapter.HeroDetailsImpl_ResponseAdapter
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * A character from the Star Wars universe
 */
interface HeroDetailsImpl : HeroDetail, GraphqlFragment {
  override val __typename: String

  override fun marshaller(): ResponseFieldMarshaller

  data class DroidHeroDetailsImpl(
    override val __typename: String,
    /**
     * The name of the character
     */
    override val name: String,
    /**
     * The friends of the character exposed as a connection with edges
     */
    override val friendsConnection: FriendsConnection,
    /**
     * This droid's primary function
     */
    override val primaryFunction: String?
  ) : HeroDetail, HeroDetail.Droid, HeroDetail.Droid.Droid, HeroDetailsImpl {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        HeroDetailsImpl_ResponseAdapter.DroidHeroDetailsImpl.toResponse(writer, this)
      }
    }

    /**
     * A connection object for a character's friends
     */
    data class FriendsConnection(
      /**
       * The total number of friends
       */
      override val totalCount: Int?,
      /**
       * The edges for each of the character's friends.
       */
      override val edges: List<Edge?>?
    ) : HeroDetail.FriendsConnection, HeroDetail.Droid.FriendsConnection,
        HeroDetail.Droid.Droid.FriendsConnection {
      override fun marshaller(): ResponseFieldMarshaller {
        return ResponseFieldMarshaller { writer ->
          HeroDetailsImpl_ResponseAdapter.DroidHeroDetailsImpl.FriendsConnection.toResponse(writer, this)
        }
      }

      /**
       * An edge object for a character's friends
       */
      data class Edge(
        /**
         * The character represented by this friendship edge
         */
        override val node: Node?
      ) : HeroDetail.FriendsConnection.Edge, HeroDetail.Droid.FriendsConnection.Edge,
          HeroDetail.Droid.Droid.FriendsConnection.Edge {
        override fun marshaller(): ResponseFieldMarshaller {
          return ResponseFieldMarshaller { writer ->
            HeroDetailsImpl_ResponseAdapter.DroidHeroDetailsImpl.FriendsConnection.Edge.toResponse(writer, this)
          }
        }

        /**
         * A character from the Star Wars universe
         */
        data class Node(
          /**
           * The name of the character
           */
          override val name: String
        ) : HeroDetail.FriendsConnection.Edge.Node, HeroDetail.Droid.FriendsConnection.Edge.Node,
            HeroDetail.Droid.Droid.FriendsConnection.Edge.Node {
          override fun marshaller(): ResponseFieldMarshaller {
            return ResponseFieldMarshaller { writer ->
              HeroDetailsImpl_ResponseAdapter.DroidHeroDetailsImpl.FriendsConnection.Edge.Node.toResponse(writer, this)
            }
          }
        }
      }
    }
  }

  data class HumanHeroDetailsImpl(
    override val __typename: String,
    /**
     * The name of the character
     */
    override val name: String,
    /**
     * The friends of the character exposed as a connection with edges
     */
    override val friendsConnection: FriendsConnection
  ) : HeroDetail, HeroDetail.Human, HumanDetail, HeroDetailsImpl {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        HeroDetailsImpl_ResponseAdapter.HumanHeroDetailsImpl.toResponse(writer, this)
      }
    }

    /**
     * A connection object for a character's friends
     */
    data class FriendsConnection(
      /**
       * The total number of friends
       */
      override val totalCount: Int?,
      /**
       * The edges for each of the character's friends.
       */
      override val edges: List<Edge?>?
    ) : HeroDetail.FriendsConnection, HeroDetail.Human.FriendsConnection {
      override fun marshaller(): ResponseFieldMarshaller {
        return ResponseFieldMarshaller { writer ->
          HeroDetailsImpl_ResponseAdapter.HumanHeroDetailsImpl.FriendsConnection.toResponse(writer, this)
        }
      }

      /**
       * An edge object for a character's friends
       */
      data class Edge(
        /**
         * The character represented by this friendship edge
         */
        override val node: Node?
      ) : HeroDetail.FriendsConnection.Edge, HeroDetail.Human.FriendsConnection.Edge {
        override fun marshaller(): ResponseFieldMarshaller {
          return ResponseFieldMarshaller { writer ->
            HeroDetailsImpl_ResponseAdapter.HumanHeroDetailsImpl.FriendsConnection.Edge.toResponse(writer, this)
          }
        }

        /**
         * A character from the Star Wars universe
         */
        data class Node(
          /**
           * The name of the character
           */
          override val name: String
        ) : HeroDetail.FriendsConnection.Edge.Node, HeroDetail.Human.FriendsConnection.Edge.Node {
          override fun marshaller(): ResponseFieldMarshaller {
            return ResponseFieldMarshaller { writer ->
              HeroDetailsImpl_ResponseAdapter.HumanHeroDetailsImpl.FriendsConnection.Edge.Node.toResponse(writer, this)
            }
          }
        }
      }
    }
  }

  data class OtherHeroDetailsImpl(
    override val __typename: String,
    /**
     * The name of the character
     */
    override val name: String,
    /**
     * The friends of the character exposed as a connection with edges
     */
    override val friendsConnection: FriendsConnection
  ) : HeroDetail, HeroDetailsImpl {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller { writer ->
        HeroDetailsImpl_ResponseAdapter.OtherHeroDetailsImpl.toResponse(writer, this)
      }
    }

    /**
     * A connection object for a character's friends
     */
    data class FriendsConnection(
      /**
       * The total number of friends
       */
      override val totalCount: Int?,
      /**
       * The edges for each of the character's friends.
       */
      override val edges: List<Edge?>?
    ) : HeroDetail.FriendsConnection {
      override fun marshaller(): ResponseFieldMarshaller {
        return ResponseFieldMarshaller { writer ->
          HeroDetailsImpl_ResponseAdapter.OtherHeroDetailsImpl.FriendsConnection.toResponse(writer, this)
        }
      }

      /**
       * An edge object for a character's friends
       */
      data class Edge(
        /**
         * The character represented by this friendship edge
         */
        override val node: Node?
      ) : HeroDetail.FriendsConnection.Edge {
        override fun marshaller(): ResponseFieldMarshaller {
          return ResponseFieldMarshaller { writer ->
            HeroDetailsImpl_ResponseAdapter.OtherHeroDetailsImpl.FriendsConnection.Edge.toResponse(writer, this)
          }
        }

        /**
         * A character from the Star Wars universe
         */
        data class Node(
          /**
           * The name of the character
           */
          override val name: String
        ) : HeroDetail.FriendsConnection.Edge.Node {
          override fun marshaller(): ResponseFieldMarshaller {
            return ResponseFieldMarshaller { writer ->
              HeroDetailsImpl_ResponseAdapter.OtherHeroDetailsImpl.FriendsConnection.Edge.Node.toResponse(writer, this)
            }
          }
        }
      }
    }
  }
}