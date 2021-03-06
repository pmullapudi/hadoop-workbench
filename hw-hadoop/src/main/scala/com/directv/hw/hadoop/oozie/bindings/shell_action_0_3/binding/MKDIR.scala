// JAXB

package com.directv.hw.hadoop.oozie.bindings.shell_action_0_3.binding

import javax.xml.bind.annotation.{XmlAccessType, XmlAccessorType, XmlAttribute, XmlType}

import scala.beans.BeanProperty


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MKDIR", namespace = "uri:oozie:shell-action:0.3") class MKDIR {
  @XmlAttribute(name = "path", required = true)
  @BeanProperty var path: String = null

}
