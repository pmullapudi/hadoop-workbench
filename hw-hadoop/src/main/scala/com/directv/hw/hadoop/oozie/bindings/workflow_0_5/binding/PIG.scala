// JAXB

package com.directv.hw.hadoop.oozie.bindings.workflow_0_5.binding

import java.util.{ArrayList, List}
import javax.xml.bind.annotation._

import com.google.gson.annotations.SerializedName

import scala.beans.BeanProperty


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "pig")
@XmlType(name = "PIG", propOrder = Array("jobTracker", "nameNode", "prepare", "jobXml", "configuration", "script", "param", "argument", "file",
  "archive"), namespace = "uri:oozie:workflow:0.5") class PIG {
  @XmlElement(name = "job-tracker")
  @SerializedName("job-tracker")
  @BeanProperty var jobTracker: String = null
  @XmlElement(name = "name-node")
  @SerializedName("name-node")
  @BeanProperty var nameNode: String = null
  @BeanProperty var prepare: PREPARE = null
  @XmlElement(name = "job-xml")
  @SerializedName("job-xml")
  @BeanProperty val jobXml: List[String] = new ArrayList[String]
  @BeanProperty var configuration: CONFIGURATION = null
  @XmlElement(required = true)
  @BeanProperty var script: String = null
  @BeanProperty val param: List[String] = new ArrayList[String]
  @BeanProperty val argument: List[String] = new ArrayList[String]
  @BeanProperty val file: List[String] = new ArrayList[String]
  @BeanProperty val archive: List[String] = new ArrayList[String]

}
