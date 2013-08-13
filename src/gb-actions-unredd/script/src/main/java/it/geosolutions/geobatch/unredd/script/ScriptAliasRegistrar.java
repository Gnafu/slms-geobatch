/*
 *  GeoBatch - Open Source geospatial batch processing system
 *  https://github.com/nfms4redd/nfms-geobatch
 *  Copyright (C) 2007-2008-2009 GeoSolutions S.A.S.
 *  http://www.geo-solutions.it
 *
 *  GPLv3 + Classpath exception
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.geosolutions.geobatch.unredd.script;

import it.geosolutions.geobatch.registry.AliasRegistrar;
import it.geosolutions.geobatch.registry.AliasRegistry;
import it.geosolutions.geobatch.unredd.script.ingestion.IngestionConfiguration;
import it.geosolutions.geobatch.unredd.script.model.GeoServerBasicConfig;
import it.geosolutions.geobatch.unredd.script.publish.PublishingConfiguration;
import it.geosolutions.geobatch.unredd.script.reprocess.ReprocessConfiguration;

/**
 * Register XStream aliases for the relevant services we ship in this class.
 * 
 * @author Luca Paolino <luca.paolino@geo-solutions.it>
 */
public class ScriptAliasRegistrar extends AliasRegistrar {

    public ScriptAliasRegistrar(AliasRegistry registry) {
        LOGGER.info(getClass().getSimpleName() + ": registering alias.");
        registry.putAlias("IngestionConfiguration", IngestionConfiguration.class);
        registry.putAlias("PublishingConfiguration", PublishingConfiguration.class);
        registry.putAlias("ReprocessConfiguration", ReprocessConfiguration.class);
        registry.putAlias("GeoServerConfiguration", GeoServerBasicConfig.class);
    }
}
