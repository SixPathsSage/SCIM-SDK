package de.gold.scim.server.endpoints.base;

import de.gold.scim.common.constants.ClassPathReferences;
import de.gold.scim.common.resources.Group;
import de.gold.scim.common.utils.JsonHelper;
import de.gold.scim.server.endpoints.EndpointDefinition;
import de.gold.scim.server.endpoints.ResourceHandler;


/**
 * author Pascal Knueppel <br>
 * created at: 07.10.2019 - 20:44 <br>
 * <br>
 * this is the default endpoint definition for the /Groups endpoint as it was defined in the RFC7643
 */
public class GroupEndpointDefinition extends EndpointDefinition
{

  public GroupEndpointDefinition(ResourceHandler<Group> resourceHandler)
  {
    super(JsonHelper.loadJsonDocument(ClassPathReferences.GROUP_RESOURCE_TYPE_JSON),
          JsonHelper.loadJsonDocument(ClassPathReferences.GROUP_SCHEMA_JSON), null, resourceHandler);
  }
}
