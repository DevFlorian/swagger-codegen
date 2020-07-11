//
// MixedPropertiesAndAdditionalPropertiesClass.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct MixedPropertiesAndAdditionalPropertiesClass: Codable {

    public var uuid: UUID?
    public var dateTime: Date?
    public var map: [String:Animal]?

    public init(uuid: UUID?, dateTime: Date?, map: [String:Animal]?) {
        self.uuid = uuid
        self.dateTime = dateTime
        self.map = map
    }


}
