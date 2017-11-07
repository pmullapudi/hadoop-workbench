DROP TABLE HDFS;

CREATE TABLE HDFS_ACCESS (
  PLATFORM_ID INT(11) NOT NULL,
  CLUSTER_ID VARCHAR(256) NOT NULL,
  NAMENODE_HOST VARCHAR(256) NOT NULL,
  NAMENODE_PORT INT(11) NOT NULL,
  KERBERIZED TINYINT(1) NOT NULL DEFAULT '0',
  IMPERSONATED TINYINT(1) NOT NULL DEFAULT '0',
  USER_ID int(11) DEFAULT NULL,
  CONSTRAINT HDFS_ACCESS_PK PRIMARY KEY (PLATFORM_ID, CLUSTER_ID),
  CONSTRAINT HDFS_CLUSTER_FK FOREIGN KEY (PLATFORM_ID, CLUSTER_ID) REFERENCES CLUSTER (PLATFORM_ID, CLUSTER_ID) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT HDFS_USER_FK FOREIGN KEY (USER_ID) REFERENCES USER (ID) ON DELETE SET NULL
)
