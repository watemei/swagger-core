package com.wordnik.swagger.jersey.listing

import com.wordnik.swagger.jaxrs.listing._

import javax.ws.rs.core.{ MultivaluedMap, MediaType }
import javax.ws.rs.ext.{ Provider, MessageBodyWriter }
import javax.ws.rs.Produces

import java.lang.reflect.Type
import java.io._

@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
@Provider
class JerseyApiDeclarationProvider extends ApiDeclarationProvider

@Produces(Array(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML))
@Provider
class JerseyResourceListingProvider extends ResourceListingProvider