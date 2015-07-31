/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package one.two.three;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.facebook.thrift.lite.*;
import com.facebook.thrift.lite.protocol.*;


public class IncludesLogger {

  public final Includes.EventType mEventType;

  private final Map<ThriftProperty<?>, Object> mMap = new HashMap<ThriftProperty<?>, Object>();

  public IncludesLogger(Includes.EventType type) {
    mEventType = type;
  }

  public <T> IncludesLogger addProperty(ThriftProperty<T> property, T value) {
    mMap.put(property, value);
    return this;
  }

  public static <T> void writeFieldBegin(TBinaryProtocol oprot, ThriftProperty<T> field) throws IOException {
    TField tField = new TField(field.key, field.type, field.id);
    oprot.writeFieldBegin(tField);
  }

  public void write(TBinaryProtocol oprot) throws IOException {
    switch (mEventType) {
      case Included: {
        oprot.writeStructBegin(new TStruct("Included"));
        if (mMap.containsKey(Includes.Included_MyIntField) && mMap.get(Includes.Included_MyIntField) != null) {
          writeFieldBegin(oprot, Includes.Included_MyIntField);
          oprot.writeI64((long) mMap.get(Includes.Included_MyIntField));
          oprot.writeFieldEnd();
        }
      
        oprot.writeFieldStop();
        oprot.writeStructEnd();
        break;
      }
      
      
    }
  }
}