package rcc

// ChangeType for a key
type ChangeType int

const (
	// ADD a new value
	ADD ChangeType = iota
	// MODIFY a old value
	MODIFY
	// DELETE ...
	DELETE
)

// String
func (c ChangeType) String() string {
	switch c {
	case ADD:
		return "ADD"
	case MODIFY:
		return "MODIFY"
	case DELETE:
		return "DELETE"
	}

	return "UNKNOW"
}

// ChangeEvent change event
type ChangeEvent struct {
	Changes map[string]*Change
}

// Change represent a single key change
type Change struct {
	OldValue   string
	NewValue   string
	ChangeType ChangeType
}

func makeDeleteChange(_, value string) *Change {
	return &Change{
		ChangeType: DELETE,
		OldValue:   value,
	}
}

func makeModifyChange(_, oldValue, newValue string) *Change {
	return &Change{
		ChangeType: MODIFY,
		OldValue:   oldValue,
		NewValue:   newValue,
	}
}

func makeAddChange(_, value string) *Change {
	return &Change{
		ChangeType: ADD,
		NewValue:   value,
	}
}
