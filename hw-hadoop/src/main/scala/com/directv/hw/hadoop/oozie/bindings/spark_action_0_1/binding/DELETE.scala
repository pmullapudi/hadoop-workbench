// JAXB

package com.directv.hw.hadoop.oozie.bindings.spark_action_0_1.binding

import javax.xml.bind.annotation.{XmlAccessType, XmlAccessorType, XmlAttribute, XmlType}

import scala.beans.BeanProperty


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DELETE", namespace = "uri:oozie:spark-action:0.1") class DELETE {
  @XmlAttribute(name = "path", required = true)
  @BeanProperty var path: String = null

}
