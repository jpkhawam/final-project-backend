CREATE INDEX activities_city_id ON activities (city_id);
CREATE INDEX activities_accessible_special_needs_activity_id ON activities_special_needs (activity_id);
CREATE INDEX activities_not_accessible_special_needs_activity_id ON activities_not_accessible_special_needs (activity_id);
CREATE INDEX family_members_family_id ON family_members (family_id);
CREATE INDEX family_members_special_needs_family_id ON family_members_special_needs (family_id);
CREATE INDEX family_members_activity_types_family_id ON family_members_activity_types (family_id);
CREATE INDEX families_activities_tags_family_id ON families_activities_tags (family_id);
CREATE INDEX reviews_activity_id ON reviews (activity_id);
